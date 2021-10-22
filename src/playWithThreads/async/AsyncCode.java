package playWithThreads.async;

import java.util.concurrent.CompletableFuture;

public class AsyncCode {



		public static CompletableFuture<String>  calculateAsync(){
			CompletableFuture<String> completableFuture = new CompletableFuture<String>();
			
			new Thread(()->{
				try {
					
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				completableFuture.complete("computing done");
				
			}).start();
			
			return completableFuture;
		}
		
		public static void main(String[] args) {
		   calculateAsync().thenAccept((o)->System.out.println(o));
		   System.out.println("-----");
			    
		}
	}

