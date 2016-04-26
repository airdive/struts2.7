package controller;

public class FromCaiwuToCangku {//不同模块之间的重定向操作

	private int id;//属性id的作用是在重定向的过程中传递参数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute() {

		id = 999;

		System.out.println("从财务模块中的财务转到了仓库中的财务");

		return "fromcaiwu_caiwu_tocangku_caiwu";

	}
}
