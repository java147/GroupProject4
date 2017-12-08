package com.company;

public class Tax {

        double stateTax;
        double federalTax;
        int salary;

        public Tax(){

        }

        public Tax(double stax, double ftax){
            stateTax = stax;
            federalTax = ftax;

        }

        public void setStateTax(double stateTax) {
            this.stateTax = stateTax;
        }

        public double getStateTax() {
            return stateTax;
        }

        public void setFederalTax(double federalTax) {
            this.federalTax = federalTax;
        }

        public double getFederalTax() {
            return federalTax;
        }

        public void deductions()
        {


            if (salary == 60000)
            {
                stateTax = 0.0475;
                federalTax = 0.15;
                double stateTaxDed = salary * stateTax;
                double federalTaxDed = salary * federalTax;

                double grossPay =  salary - (stateTaxDed + federalTaxDed);

                System.out.println("The total gross pay is : " + grossPay);

            }

            else  if (salary == 950000)
            {
                stateTax = 0.0575;
                federalTax = 0.20;

                double stateTaxDed2 = stateTax * salary;
                double federalTaxDed2 = federalTax * salary;

                double grossPay2 = salary - (stateTaxDed2 + federalTaxDed2);

                System.out.println("the total gross pay is: " + grossPay2);
            }

            else if(salary == 35000)
            {
                stateTax = 0.0475;
                federalTax = 0.15;
                double stateTaxDed3 = salary * stateTax;
                double federalTaxDed3 = salary * federalTax;

                double grossPay3 =  salary - (stateTaxDed3 + federalTaxDed3);

                System.out.println("The total gross pay is : " + grossPay3);
            }

            else if(salary == 85000)
            {
                stateTax = 0.0475;
                federalTax = 0.15;
                double stateTaxDed4 = salary * stateTax;
                double federalTaxDed4 = salary * federalTax;

                double grossPay4 =  salary - (stateTaxDed4 + federalTaxDed4);

                System.out.println("The total gross pay is : " + grossPay4);



            }

            else if (salary == 60000)
            {
                stateTax = 0.0475;
                federalTax = 0.15;
                double stateTaxDed5 = salary * stateTax;
                double federalTaxDed5 = salary * federalTax;

                double grossPay5 =  salary - (stateTaxDed5 + federalTaxDed5);

                System.out.println("The total gross pay is : " + grossPay5);
            }


            else
                System.out.print("Error: Invaild entry! ");




        }




    }


