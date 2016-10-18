package es.upm.miw.pd.visitor.solution;

public class Visitor2 extends Visitor {
	private int sumAs=0;
	private int sumBs=0;
	
    public int getAs() {
    	return sumAs;
    }

    public int getBs() {
    	return sumBs;
    }

	@Override
	public void visitElementA(ElementA e) {
		sumAs+=1;
        System.out.println("Visitador 2 --> elemento: " + e.getAttributeA());
	}

	@Override
	public void visitElementB(ElementB e) {
		sumBs+=1;
        System.out.println("Visitador 2 --> elemento: " + e.getAttributeB());
	}

}
