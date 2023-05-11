package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

        @DataProvider(name = "credentials")
        public Object [][] getData (){
            Object[][] data = new Object[7][8];
            data[0][0] = "Tester";
            data[0][1] = "Dunstable, Central Bedfordshire";
            data[0][2] = "5 miles";
            data[0][3] = "30000";
            data[0][4] = "60000";
            data[0][5] = "Per annum";
            data[0][6] = "Permanent";
            data[0][7] = "Permanent Tester jobs in Dunstable";

            data[1][0] = "Accountant";
            data[1][1] = "Dunstable, Central Bedfordshire";
            data[1][2] = "5 miles";
            data[1][3] = "30000";
            data[1][4] = "60000";
            data[1][5] = "Per annum";
            data[1][6] = "Permanent";
            data[1][7] = "Permanent Accountant jobs in Dunstable";


            data[2][0] = "Account Manager";
            data[2][1] = "Dunstable, Central Bedfordshire";
            data[2][2] = "7 miles";
            data[2][3] = "2500";
            data[2][4] = "5000";
            data[2][5] = "Per month";
            data[2][6] = "Permanent";
            data[2][7] = "Permanent Account Manager jobs in Dunstable";

            data[3][0] = "Software Engineer";
            data[3][1] = "Dunstable, Central Bedfordshire";
            data[3][2] = "10 miles";
            data[3][3] = "40000";
            data[3][4] = "100000";
            data[3][5] = "Per annum";
            data[3][6] = "Permanent";
            data[3][7] = "Permanent Software Engineer jobs in Dunstable";

            data[4][0] = "Software Test Engineer";
            data[4][1] = "Dunstable, Central Bedfordshire";
            data[4][2] = "15 miles";
            data[4][3] = "50000";
            data[4][4] = "80000";
            data[4][5] = "Per annum";
            data[4][6] = "Permanent";
            data[4][7] = "Permanent Software Test Engineer jobs in Dunstable";

            data[5][0] = "Software Engineer";
            data[5][1] = "Dunstable, Central Bedfordshire";
            data[5][2] = "10 miles";
            data[5][3] = "40000";
            data[5][4] = "100000";
            data[5][5] = "Per annum";
            data[5][6] = "Permanent";
            data[5][7] = "Permanent Software Engineer jobs in Dunstable";


            data[6][0] = "Bank Manager";
            data[6][1] = "Dunstable, Greater London";
            data[6][2] = "7 miles";
            data[6][3] = "40000";
            data[6][4] = "60000";
            data[6][5] = "Per annum";
            data[6][6] = "Permanent";
            data[6][7] = "Permanent Bank Manager jobs in Dunstable";

            return data;
        }

    }
