public class Module2 {



    public void datascience(){
        System.out.println("");
        String DS[]={"Machine Learning","Operating System","DBMS","Software Engineerig","Foundation of Data Science"};


        System.out.println("The books available in DataScience Department are as follow:");
        for (int i=0; i< DS.length;i++){

            System.out.println(DS[i]);

        }


    }


    public void computerscience(){
        System.out.println("");
        String CS[]={"Data Structure and Algorithm","Computer Netwoks","Computer Vision"};

        System.out.println("The books available in Computer Science department are as follow:");

        for(int j=0; j<CS.length;j++){

            System.out.println(CS[j]);
        }

    }



    public void IT(){

        System.out.println("The books available in IT department are as follow: ");
        String IT[]={"Internet and Web technology","Artificial Intelligence","Data Vusualization"};

        for (int k=0;k< IT.length;k++){

            System.out.println(IT[k]);
        }

    }


}
