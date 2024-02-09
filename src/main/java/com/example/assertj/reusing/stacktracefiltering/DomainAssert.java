package com.example.assertj.reusing.stacktracefiltering;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class DomainAssert extends AbstractAssert<DomainAssert, DomainObject> {

        public DomainAssert(DomainObject actual) {
            super(actual, DomainAssert.class);
        }

        public static DomainAssert assertThat(DomainObject actual) {
            return new DomainAssert(actual);
        }

        public DomainAssert hasName(String expected) {
            isNotNull();

            Assertions.assertThat(actual.getName()).isEqualTo(expected);

            return this;
        }


}
