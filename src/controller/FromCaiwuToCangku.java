package controller;

public class FromCaiwuToCangku {//��ͬģ��֮����ض������

	private int id;//����id�����������ض���Ĺ����д��ݲ���

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute() {

		id = 999;

		System.out.println("�Ӳ���ģ���еĲ���ת���˲ֿ��еĲ���");

		return "fromcaiwu_caiwu_tocangku_caiwu";

	}
}
