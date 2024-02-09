package com.example.assertj.reusing.stacktracefiltering;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DomainObjectTest {



    @Test
    void usingCustomAssertions() {
        DomainObject dings = new DomainObject();
        dings.setName("Susi");

        DomainAssert.assertThat(dings).hasName("Richy");
    }

    @Test
    void usingNativeAssertJ() {
        DomainObject dings = new DomainObject();
        dings.setName("Susi");

        Assertions.assertThat(dings.getName()).isEqualTo("Richy");

    }


}