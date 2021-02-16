package com.hiwijaya.testing;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;


/**
 * @author Happy Indra Wijaya
 *
 * Filtering test with Tag.
 * To run with Maven: mvn test -Dgroups=tag1,tag2
 *
 */
@Tags({
    @Tag("integration-test")
})
//@Tag("integration-test")
public class IntegrationTest {


    @Test
    public void test1(){

    }

    @Test
    public void test2(){

    }

}
