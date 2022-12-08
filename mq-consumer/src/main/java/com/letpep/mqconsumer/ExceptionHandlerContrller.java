package com.letpep.mqconsumer;



import com.letpep.common.model.ErrorMsg;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandlerContrller {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public List exception(MethodArgumentNotValidException e) {

        BindingResult bindingResult = e.getBindingResult();

        List allErrors = bindingResult.getAllErrors();

        List errorMsgs = new ArrayList<>();

        allErrors.forEach(objectError -> {

            ErrorMsg errorMsg = new ErrorMsg();

            FieldError fieldError = (FieldError)objectError;

            errorMsg.setFiled(fieldError.getField());

            errorMsg.setObjectName(fieldError.getObjectName());

            errorMsg.setMessage(fieldError.getDefaultMessage());

            errorMsgs.add(errorMsg);

        });

        return errorMsgs;

    }

}
