import java.util.ArrayList;
import java.util.List;


public class Test {

public static testBean a = new testBean(1,"��",0);
public static testBean a1 = new testBean(11,"��1",1);
public static testBean a2 = new testBean(12,"��2",1);
public static testBean a3 = new testBean(13,"��3",1);
public static testBean a11 = new testBean(111,"��1",11);
public static testBean a12 = new testBean(112,"��2",11);
public static testBean a13 = new testBean(113,"��3",11);
public static testBean a21 = new testBean(121,"��1",12);
public static testBean a22 = new testBean(122,"��2",12);
public static testBean a23 = new testBean(123,"��3",12);
public static testBean a31 = new testBean(131,"��1",13);
public static testBean a32 = new testBean(132,"��2",13);
public static testBean a33 = new testBean(133,"��3",13);

public static void main(String[] args) {
	getResult();
}
public static  List<testBean> getList(){
	List<testBean> result= new ArrayList<testBean>();
	result.add(a);
	result.add(a1);
	result.add(a2);
	result.add(a3);
	result.add(a11);
	result.add(a12);
	result.add(a13);
	result.add(a21);
	result.add(a22);
	result.add(a23);
	result.add(a31);
	result.add(a32);
	result.add(a33);
	return result;
}

public static  void getResult(){
	result res = new result();
	getResult1(getList(),res,1);
	
	
	System.out.println(res);
}

public static result getResult1(List<testBean> list, result res, int id){
	List<result> zlist =new ArrayList<result>();
	for (testBean testBean : list) {
		if(testBean.getId()==id){
			res.setBean(testBean);
		
		}
		if(testBean.getFid()==id){
			result zre =new result();
			zre.setBean(testBean);
			zlist.add(zre);
		}		
	}
	res.setzBean(zlist);
  
  if(!zlist.isEmpty()&&zlist.size()>0){
	  for (result re : zlist) {
		  getResult1(list,re,re.getBean().getId());
	  }
	}
  return res;
  }


}
