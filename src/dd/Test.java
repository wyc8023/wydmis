package dd;


public class Test {

//	public static void main(String[] args) {
//		List<testBean> list =new ArrayList<testBean>();//�ϵ�
//		List<testBeanNew> newlist =new ArrayList<testBeanNew>();//�µ�
//		for (testBean testBean : list) {
//			testBeanNew testBeanNew =new  testBeanNew();
//			BeanUtils.copyProperties(testBean, testBeanNew);//ǰ������
//			newlist.add(testBeanNew);
//		}
//
//	}
public static void main(String[] args) {
	 for(int i = 1; i < 8; i++){   //��������
//         for(int j = 0; j < 8-i;j++){   //ÿ��Ҫ��ӡ�Ŀո���
//             System.out.print(" ");
//         }
//         for(int k = 0; k < 2*i-1; k++){   //ÿ��Ҫ��ӡ�ķ��ŵĸ����������ǰһ�ж�������
//             System.out.print("*");
//         } 
//         System.out.print("\n");   //���д�ӡ
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


