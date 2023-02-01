package HW1302023;

public class PPDPTester {
    public static void main(String[] args) {
        PPDP a=new PPDP("Public","Default","Protected","Private");
        PPDP a1=new PPDP("Public","Default","Protected");
        PPDP a2=new PPDP("Public","Default");
       /* PPDP a3=new PPDP("Public");-->This one is privaate so will not work outside of class*/

        //Observation notes: outside package only public constructor works//
    }
}
