package org.jab.microservices.resource;

import java.util.Objects;
import org.jab.microservices.model.SumRequest;
import org.jab.microservices.model.SumResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    private final int LIMIT = 1000;

    @PostMapping(value = "/sum", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity sum(@RequestBody(required = false) SumRequest sumRequest) {

        //Empty Request
        if(Objects.nonNull(sumRequest)) {

            Integer number1 = sumRequest.getNumber1();
            Integer number2 = sumRequest.getNumber2();

            //Negative Rule
            if (!StringUtils.isEmpty(number1) && number1 < 0 || !StringUtils.isEmpty(number2)&& number2 < 0) {
                return ResponseEntity.badRequest().build();
            }

            //Limit Rule
            if (!StringUtils.isEmpty(number1) && number1 >= LIMIT || !StringUtils.isEmpty(number2) && number2 >= LIMIT) {
                return ResponseEntity.badRequest().build();
            }

            return ResponseEntity.ok(new SumResponse((StringUtils.isEmpty(number1) ? 0 : number1) + (StringUtils.isEmpty(number2) ? 0 : number2)));

        } else {
            return ResponseEntity.ok(new SumResponse(0));
        }

    }


}
