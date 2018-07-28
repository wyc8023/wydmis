package dd;


public class Test {

//	public static void main(String[] args) {
//		List<testBean> list =new ArrayList<testBean>();//老的
//		List<testBeanNew> newlist =new ArrayList<testBeanNew>();//新的
//		for (testBean testBean : list) {
//			testBeanNew testBeanNew =new  testBeanNew();
//			BeanUtils.copyProperties(testBean, testBeanNew);//前给后复制
//			newlist.add(testBeanNew);
//		}
//
//	}
public static void main(String[] args) {
	 for(int i = 1; i < 8; i++){   //控制行数
//         for(int j = 0; j < 8-i;j++){   //每行要打印的空格数
//             System.out.print(" ");
//         }
//         for(int k = 0; k < 2*i-1; k++){   //每行要打印的符号的个数（相对于前一行多两个）
//             System.out.print("*");
//         } 
//         System.out.print("\n");   //换行打印
		 for (int j = 1; j < 8-i; j++) {
			 System.out.print("*");
		}
		 for (int k = 1; k < i; k++) {
			 System.out.print(k);
		}
		 for (int z = i; z > 0; z--) {
			 System.out.print(z);
		}
		 System.out.println();
     }
		
	 }
	 
}


