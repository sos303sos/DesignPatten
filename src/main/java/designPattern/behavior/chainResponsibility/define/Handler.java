/**
 * project: designPatten
 * package: designPattern.chainResponsibility.define
 * file: Handler.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月20日 上午11:07:49
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月20日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.chainResponsibility.define;


/**
  * class: Handler<BR>
  * description: 抽象处理类 主要有三个职责<BR>
  * author: 95129<BR>
  * date: 2018年10月20日 上午11:07:49<BR>
  *
  */
public abstract class Handler {
    private Handler nextHandler;
    /**
     *<p>
      * method:  handlerMessage<BR>
      * description:  职责1:定义一个请求的处理方法handlerMessage,唯一对外开放的方法<BR>
      * author:  95129<BR>
      * date:  2018年10月20日 上午11:12:27<BR>
      * 
      * @param request
      * @return  
      */
    public final Response handlerMessage(Request request){
        Response response=null;
        if(this.getHandlerLevel().equals(request.getRequestLevel())){
            response=this.echo(request);
        }else{
            if(this.nextHandler!=null){
                response=this.nextHandler.handlerMessage(request);
            }else{
                
            }
        }
        return response;
    }
    /**
     *<p>
      * method:  setNext<BR>
      * description:  职责2:定义一个链的编排方法setNext,设定下一个处理者<BR>
      * author:  95129<BR>
      * date:  2018年10月20日 上午11:13:02<BR>
      * 
      * @param _handler  
      */
    public void setNext(Handler _handler){
        this.nextHandler=_handler;
    }
    /**
     *<p>
      * method:  getHandlerLevel<BR>
      * description:  实现者必须实现的两个方法<BR>
      * author:  95129<BR>
      * date:  2018年10月20日 上午11:13:58<BR>
      * 
      * @return  
      */
    protected abstract Level getHandlerLevel();
    /**
     *<p>
      * method:  echo<BR>
      * description:  实现者必须实现的两个方法<BR>
      * author:  95129<BR>
      * date:  2018年10月20日 上午11:14:21<BR>
      * 
      * @param request
      * @return  
      */
    protected abstract Response echo(Request request);
}
