package creationtype.chouxianggongchang;

/**
 * Created by handl on 2017/9/23.
 *
 *
 * 产品油箱实现类----飞机产品族
 *
 */
public class FeiJiYouXiang extends YouXiang{
    @Override
    public void say() {
        System.out.println(this.model+",容量="+this.capacity);
    }
}
