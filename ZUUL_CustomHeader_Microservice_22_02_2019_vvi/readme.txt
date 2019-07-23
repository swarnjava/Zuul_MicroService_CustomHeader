step 1: Run Test1_EurekaService

step 2: Run Test1_EurekaClient1

step 2: Run Test1_EurekaClient2

step3: Run Test1_EurekaProxy

step4:Run Test_EurekaFeignClient

Then in browser test the url: http://localhost:7744/test

The above url will hit the Test_EurekaFeignClient==> Then will hit Test1_EurekaProxy==>               Then Test1_EurekaService==>Then Run Test1_EurekaClient1