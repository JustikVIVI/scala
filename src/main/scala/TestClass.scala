// diamond problem tests
class TestClass extends B with A with C {
  override def get: String = super.get
}

trait A {
  def get = "A"
}

trait B {
  def get = "B"
}

trait C {
  def get = "C"
}
