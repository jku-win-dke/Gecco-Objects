package com.optimization.data.tdg.service.dto;

import java.util.List;

public class NmfBotTestDataConfigDTO {
    private List<TestDataConfigElement> testDataConfigElements;
    private TestDataConfigGlobal testDataConfigGlobal;

    @Override
    public String toString() {
        return "TestDataConfigDTO{" +
                "testDataConfigElements=" + testDataConfigElements +
                ", testDataConfigGlobal=" + testDataConfigGlobal +
                '}';
    }

    public List<TestDataConfigElement> getTestDataConfigElements() {
        return testDataConfigElements;
    }

    public void setTestDataConfigElements(List<TestDataConfigElement> testDataConfigElements) {
        this.testDataConfigElements = testDataConfigElements;
    }

    public TestDataConfigGlobal getTestDataConfigGlobal() {
        return testDataConfigGlobal;
    }

    public void setTestDataConfigGlobal(TestDataConfigGlobal testDataConfigGlobal) {
        this.testDataConfigGlobal = testDataConfigGlobal;
    }
}
