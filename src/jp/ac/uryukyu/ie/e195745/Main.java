package jp.ac.uryukyu.ie.e195745;

public class Main {
	@SuppressWarnings("null")
	public static void main(String[] args) {

		String str = null;
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException発生");
            System.out.println(e.getMessage());
        }

	}

}