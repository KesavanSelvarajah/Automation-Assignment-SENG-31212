package com.test.qa.sampleRequest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.utils.APIUtils;
import com.test.qa.utils.Constants;

import java.util.HashMap;

public class PetProject {

    @Test(priority = 1)
    public void testResponseCode(){
        SoftAssert softAssert = new SoftAssert();
        //Response response = get(Constants.BASE_URL_WEATHER+Constants.ENDPOINT_WEATHER+Constants.QUERY_PARAMETER);
        //softAssert.assertEquals(response.getStatusCode(), 200, Constants.INVALID_CODE_TEXT);
        //APIUtils.printResults(response);
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void testPostRequest(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Post Request
        //Todo - Assert Response Status Code
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void testGetRequest(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Get Request
        //Todo - Assert Response Status Code
        //Todo - Assert Response Body
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void testPutRequest(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Put RequestGet
        //Todo - Assert Response Status Code
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void testGetRequestForUpdatedData(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Get Request
        //Todo - Assert Response Status Code
        //Todo - Assert Response Body
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 6)
    public void testDeleteRequest(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Delete RequestGet
        //Todo - Assert Response Status Code
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void testGetRequestForDeletedData(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Get RequestGet
        //Todo - Assert Response Status Code
        //Todo - Print Response
        softAssert.assertAll();
    }
}
