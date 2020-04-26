package com.anurag.java8.practise;

public class CovertorImpl {

	public static void main(String[] args) {
		CovertorImpl obj = new CovertorImpl();
		obj.convertExample();
	}
	public void convertExample() {

		MyConvertor<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted); 

		int num = 1;
		MyConvertor<Integer, String> stringConverter =
				(from) -> String.valueOf(from + num);

				String converted1 =  stringConverter.convert(2); 
				System.out.println(converted1); // 3

				int num1 = 1;
				MyConvertor<Integer, String> stringConverter1 =
						(from) -> String.valueOf(from + num1);
						//num1 = 3;
		Lambda4 objlmbda = new Lambda4();
		objlmbda.testScopes();
	}

}
