package com.test.threadracing.service;

import com.test.threadracing.entity.NumberIncrement;
import com.test.threadracing.repository.NumberIncrementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author amit
 * below is the service implementation class for the incrementing the number
 */

@Service
@Slf4j
public class NumberIncrementServiceImpl implements NumberIncrementService {

    @Autowired
    private NumberIncrementRepository numberIncrementRepository;

    // below is the synchronized method (for thread race condition) for incrementing the current number by 1.
    @Override
    public synchronized Long incrementNumber() {

        Long currentNumber=0L;
        try{
            //1st fetch the current number
            NumberIncrement numberIncrementEntity=numberIncrementRepository.getEntityById(1L);
            if(numberIncrementEntity!=null){
                currentNumber=numberIncrementEntity.getNum();
                log.info("Current value :- {}",currentNumber);

                //increment number by one
                numberIncrementEntity.setNum(currentNumber+1L);

                //save the incremented number
                log.info("Saving incremented value ...");
                numberIncrementRepository.save(numberIncrementEntity);
            }
        }catch(Exception exp){
            log.error("Exception :- {}",exp.getMessage());
        }
        return currentNumber+1;
    }
}
