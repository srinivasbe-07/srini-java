package exception;

class MuseumClosed extends RuntimeException {

}

class MuseumClosedForLunch extends MuseumClosed {

	
}

public class CatchingException {

	public static void main(String[] args) {
		try {
			Math.random();
		}
		
//		catch (RuntimeException e) {
//			// TODO: handle exception
//		}
		//Because of bellow code line 23 witll throw exception. Because
		//Museum Class is a parent class and MuseumClosedForLunch is a child calss
		//which should be catch first
//		catch (MuseumClosed e) {  
//			// TODO: handle exception  
//		}

		
		catch(MuseumClosedForLunch e) {
			
		}
//		catch (RuntimeException e) {
//			// TODO: handle exception
//		}
		catch (MuseumClosed e) {  
			// TODO: handle exception  
		}
		
		catch (RuntimeException e) {
			// TODO: handle exception
		}
	}
	public static void visitMuseum() {
		boolean b = Math.random() < 5;

		if (b) {
			throw new MuseumClosed();
		}
		throw  new MuseumClosedForLunch();
	}
}
