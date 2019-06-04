package easy;

public class Test07 {
	public static int reverse(int x) {
		int result = 0;
		int temp =0;
		boolean flag ;
		if (x>0) {
			flag = true;
		}else {
			flag = false;
		}
		x=Math.abs(x);
		for (; x>0; ) {
			if (result>(Integer.MAX_VALUE-x%10)/10) {
				return 0;
			}else {
                temp=x%10;  
                result=result*10+temp;  
                x=x/10;
			}
			
		}
		if (!flag) {
			return -result;
		}
		return result;
	}
}
