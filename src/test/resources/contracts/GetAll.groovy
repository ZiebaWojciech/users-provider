import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("Get Users")

    request {
        method 'GET'
        url '/users'
    }

    response {
        status 200
        body([
                name: "John Doe",
                age: 25,
                email: "john.doe@example.com"
        ])
        headers {
            contentType(applicationJson())
        }
    }
}
