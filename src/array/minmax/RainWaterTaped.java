package array.minmax;

public class RainWaterTaped {

	public static void main(String[] args) {
		int[] buildings = { 4, 2, 0, 3, 2, 5 };

		int lh[] = new int[buildings.length];
		int rh[] = new int[buildings.length];
		int total = 0;
		lh[0] = buildings[0];
		rh[buildings.length - 1] = buildings[buildings.length - 1];
		for (int i = 1; i < buildings.length; i++) {
			lh[i] = Math.max(lh[i - 1], buildings[i]);
			rh[buildings.length - 1 - i] = Math.max(rh[buildings.length - i], buildings[buildings.length - 1 - i]);
		}
		for (int i = 0; i < buildings.length; i++) {
			total += Math.min(lh[i], rh[i]) - buildings[i];
		}

		System.out.println(total);
	}
}
