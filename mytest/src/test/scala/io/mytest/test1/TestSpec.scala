
package io.mytest.test1

import org.scalamock.scalatest.MockFactory
import org.scalatest._


class TestSpec extends WordSpec with MockFactory with BeforeAndAfterEach {
  override protected def beforeEach():Unit = {
    info("aaaa")
    super.beforeEach()
  }

  "test" must {
    "b" in {
      val s = Test.echo(11)
      info(s"echo : ${s}")
    }
  }

}
