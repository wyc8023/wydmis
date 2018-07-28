import java.util.ArrayList;
import java.util.List;


public class Test {

public static testBean a = new testBean(1,"·ò",0);
public static testBean a1 = new testBean(11,"·ò1",1);
public static testBean a2 = new testBean(12,"·ò2",1);
public static testBean a3 = new testBean(13,"·ò3",1);
public static testBean a11 = new testBean(111,"·ò1",11);
public static testBean a12 = new testBean(112,"·ò2",11);
public static testBean a13 = new testBean(113,"·ò3",11);
public static testBean a21 = new testBean(121,"·ò1",12);
public static testBean a22 = new testBean(122,"·ò2",12);
public static testBean a23 = new testBean(123,"·ò3",12);
public static testBean a31 = new testBean(131,"·ò1",13);
public static testBean a32 = new testBean(132,"·ò2",13);
public static testBean a33 = new testBean(133,"·ò3",13);

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
