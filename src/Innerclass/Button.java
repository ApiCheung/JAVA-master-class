package Innerclass;

/**
 * @author Esmee Zhang
 * @date 7/2/20 7:15 下午
 * @projectName JAVA-master-class
 */
public class Button {
    private String title;
    private OnClickListener onClickLister;

    public Button(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setOnClickLister(OnClickListener onClickLister) {
        this.onClickLister = onClickLister;
    }

    public void onClick(){
        this.onClickLister.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title);
    }
}
