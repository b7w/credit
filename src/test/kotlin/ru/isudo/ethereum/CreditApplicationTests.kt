package ru.isudo.ethereum

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import ru.isudo.ethereum.env.Application

@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(Application::class))
class CreditApplicationTests {

    @Test
    fun contextLoads() {
    }

}
