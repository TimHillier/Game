public class Graphics {
		static int rows = 8; 
		static int col = 8; 
		
		
		static void Graphics(){
		String[][] tile1 = new String[][] {
				{ "X ", "Ω ", "X ", "X ", "X ", "X ", "X ", "X " },
				{ "X ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "X " },
				{ "X ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "X " },
				{ "X ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "X " },
				{ "X ", "\\ ", "\\ ", "P ", "\\ ", "\\ ", "\\ ", "X " },
				{ "X ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "X " },
				{ "X ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "\\ ", "X " },
				{ "X ", "X ", "X ", "X ", "X ", "X ", "X ", "X " }};
				
				
		for (int i = 0; i < rows; i++) {
			for(int j=0;j<col;j++){
				System.out.print(tile1[i][j]);
				}
			System.out.println(); 
				
			}
			

		}

	}

