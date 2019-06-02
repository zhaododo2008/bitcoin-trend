package com.bitcoin.analysis.test;

import com.bitcoin.analysis.web.BitcoinTrendApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author zhaododo
 **/


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BitcoinTrendApplication.class})
@WebAppConfiguration
public class BaseApplicationTests {
}
