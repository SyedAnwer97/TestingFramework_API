package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    private static final Logger LOGGER = LogManager.getLogger(TestListeners.class);

    @Override
    public void onStart(ITestContext context) {
        LOGGER.info("Test suite started!!");
    }

    @Override
    public void onFinish(ITestContext context) {
        LOGGER.info("Test suite completed!!");
    }

    @Override
    public void onTestStart(ITestResult result) {
        LOGGER.info("Started!!" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LOGGER.info("Passed !!" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOGGER.error("failed !!" + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOGGER.info("Skipped!!" + result.getMethod().getMethodName());
    }
}
