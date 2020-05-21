package Set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        //创建Notice类的对象，生成三条公告
        Notice notice1 = new Notice(1,"welcome","manager",new Date());
        Notice notice2 = new Notice(2,"请同学们提交作业","teacher",new Date());
        Notice notice3 = new Notice(3,"考勤通知","teacher",new Date());

        //添加
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        //显示
        System.out.println("公告的内容为" );
        for(int i = 0; i < noticeList.size(); i++){
            System.out.println(i + 1 +":"+((Notice)(noticeList.get(i))).getTitle());
        }

        System.out.println("*********************************");
        //在第一条公告后面添加一条新公告
        Notice notice4 = new Notice(4,"在线编辑器可以使用了","manager",new Date());
        noticeList.add(1,notice4);

        //显示
        System.out.println("公告的内容为" );
        for(int i = 0; i < noticeList.size(); i++){
            System.out.println(i + 1 +":"+((Notice)(noticeList.get(i))).getTitle());
        }

        System.out.println("*********************************");

        //删除
        noticeList.remove(2);
        //显示
        System.out.println("删除公告后公告的内容为" );
        for(int i = 0; i < noticeList.size(); i++){
            System.out.println(i + 1 +":"+((Notice)(noticeList.get(i))).getTitle());
        }
        //将第二条公告改成 java在线编辑器可以使用了
        System.out.println("*********************************");
        //修改第二条公告中title的值
        notice4.setTitle("java在线编辑器可以使用了");
        noticeList.set(1,notice4);
        System.out.println("修改狗公告的内容为");
        for(int i = 0; i < noticeList.size(); i++){
            System.out.println(i + 1 +":"+((Notice)(noticeList.get(i))).getTitle());
        }
        }
    }

