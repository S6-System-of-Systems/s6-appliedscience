package institute.ptest.config

import com.typesafe.config.ConfigFactory
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Config {

    private val conf = ConfigFactory.load().getConfig("ifontys-institute-services")

    /** Get baseUrl for the given environment, as defined in the application.conf file
     *
     *
     * @param env can be staging, production, staging-backend, production-backend
     * @return application base url for the given environment
     */
    def getBaseUrl(env : String) : String = conf.getConfig(env).getString("app-url")

}