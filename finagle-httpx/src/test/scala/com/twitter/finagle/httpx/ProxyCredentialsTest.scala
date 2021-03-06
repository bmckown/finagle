package com.twitter.finagle.httpx

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ProxyCredentialsTest extends FunSuite {
  test("add Proxy-Authorization header") {
    val creds = ProxyCredentials("foo", "bar")
    assert(creds.basicAuthorization === "Basic Zm9vOmJhcg==")
  }
}
