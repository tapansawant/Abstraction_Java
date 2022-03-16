abstract class College {

    abstract void setAcademicFee();
}

class CSE extends College{

    void setAcademicFee()
    {
        System.out.println("10000");
    }
}

class MECH extends College{

    void setAcademicFee()
    {
        System.out.println("75000");
    }
}

class CollegeOffice{

    public static void main(String[] args) {

        College ob_cse = new CSE();
        College ob_mech = new MECH();

        System.out.println("CSE DEPT FEE STRUCTURE :");
        ob_cse.setAcademicFee();

        System.out.println("MECH DEPT FEE STRUCTURE :");
        ob_mech.setAcademicFee();
    }
}