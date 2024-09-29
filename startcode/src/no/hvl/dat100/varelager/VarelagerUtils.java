package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		Vare billigste = varer[0];
		
		for (int i = 0; i < varer.length; i++) {
			if (varer[i].getPris() < billigste.getPris()) {
				billigste = varer[i];
			}
		}
		return billigste;
	
	}
	
	public static double totalPris(Vare[] varer) {		
		double sum = 0;
		for (int i = 0; i < varer.length; i++) {
			sum = varer[i].getPris();
		}
		return sum;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
		int[] vareNummer = new int[varer.length];
		
		for (int i = 0; i < varer.length;i++) {
			vareNummer[i] = varer[i].getVarenr();
		}
		return vareNummer;

	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
				
		double[] differanseTabell = new double[varer.length-1];
		
		for (int i = 0; i < varer.length -1;i++){
			differanseTabell[i] = varer[i+1].getPris() - varer[i].getPris();
		}
		return differanseTabell;

	}
}
