class DataHolder<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
	
	
}

class GenericClass{
	public static void main(String args[]){
		DataHolder data=new DataHolder<>();
		data.setData("dinuka");
		data.setData(11);
		data.setData('A');
		data.setData(10.02);
		data.getData();
	}
}