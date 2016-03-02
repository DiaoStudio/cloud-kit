package sj.diao.cloud.common

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * 日志输出统一接口
 * Created by Joe on 16/3/2.
 */
trait Logging extends Serializable {
  //添加transient标签，使有Logging这个trait的对象能够跨节点序列化传输。
  @transient protected var _log: Logger = null

  /**
   * 直接在定义时初始化会导致序列化传输到远端时，由于加了transient标签，_log会为空
   * @return
   */
  protected def log: Logger = {
    if (_log == null) {
      _log = LoggerFactory.getLogger(logName)
    }
    _log
  }

  protected def logName = {
    this.getClass.getName.stripSuffix("$")
  }

}