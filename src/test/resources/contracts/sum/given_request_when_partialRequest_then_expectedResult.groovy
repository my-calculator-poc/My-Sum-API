package contracts.sum

import org.springframework.cloud.contract.spec.Contract

/**
 * Contract definition, written in a Groovy DSL
 */
Contract.make {

    /**
     * Request which completes with HTTP statusCode 200
     */
    ignored: true
    request {
        method 'POST'
        url('/sum')
        headers {
            contentType(applicationJson())
        }
        body''' \
{ 
    "number1": 1
}
'''
    }
    response {
        status 200
        body''' \
{ 
    "result": 1,
    "romanResult" : "I"
}
'''
    }
}