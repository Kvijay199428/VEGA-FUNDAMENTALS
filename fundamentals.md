```
// File: logs/vega-fundamentals.log
2026-06-13T07:26:57.730Z  INFO 17952 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication v0.0.1 using Java 21.0.10 with PID 17952 (/root/fundamentals/backend/target/vega.fundamentals.0.0.1.jar started by root in /root/fundamentals/backend)
2026-06-13T07:26:57.735Z  INFO 17952 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-13T07:27:00.816Z  INFO 17952 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-13T07:27:00.838Z  INFO 17952 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-13T07:27:00.839Z  INFO 17952 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-13T07:27:00.938Z  INFO 17952 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-13T07:27:00.939Z  INFO 17952 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2886 ms
2026-06-13T07:27:01.107Z  INFO 17952 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-13T07:27:02.516Z  INFO 17952 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-13T07:27:02.553Z  INFO 17952 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 6.285 seconds (process running for 7.841)
2026-06-13T07:27:09.875Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-13T07:27:09.882Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-13T07:27:09.886Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
2026-06-13T07:27:10.318Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-13T07:27:10.660Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Cache hit for ISIN: INE002A01018
2026-06-13T07:27:18.057Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-13T07:27:18.059Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE002A01018
2026-06-13T07:27:20.043Z ERROR 17952 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for ISIN: INE002A01018. Status code: 400. Body: {"status":"error","errors":[{"errorCode":"UDAPI100011","message":"Invalid Instrument key","propertyPath":"getCompetitors.instrumentKey","invalidValue":"INE002A01018","error_code":"UDAPI100011","property_path":"getCompetitors.instrumentKey","invalid_value":"INE002A01018"}]}
2026-06-13T07:27:20.132Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.service.FundamentalCacheService    : Cache saved for ISIN: INE002A01018
2026-06-13T07:27:24.282Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-13T07:27:24.297Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.service.FundamentalCacheService    : Cache hit for ISIN: INE002A01018
2026-06-13T07:28:36.185Z  INFO 18390 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication v0.0.1 using Java 21.0.10 with PID 18390 (/root/fundamentals/backend/target/vega.fundamentals.0.0.1.jar started by root in /root/fundamentals/backend)
2026-06-13T07:28:36.249Z  INFO 18390 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-13T07:28:39.459Z  INFO 18390 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-13T07:28:39.478Z  INFO 18390 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-13T07:28:39.479Z  INFO 18390 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-13T07:28:39.580Z  INFO 18390 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-13T07:28:39.581Z  INFO 18390 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2985 ms
2026-06-13T07:28:39.745Z  INFO 18390 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-13T07:28:41.183Z  INFO 18390 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-13T07:28:41.228Z  INFO 18390 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 6.701 seconds (process running for 8.248)
2026-06-13T07:28:49.025Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-13T07:28:49.029Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-13T07:28:49.032Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
2026-06-13T07:28:49.470Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-13T07:28:49.475Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE002A01018
2026-06-13T07:28:51.454Z ERROR 18390 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for ISIN: INE002A01018. Status code: 400. Body: {"status":"error","errors":[{"errorCode":"UDAPI100011","message":"Invalid Instrument key","propertyPath":"getCompetitors.instrumentKey","invalidValue":"INE002A01018","error_code":"UDAPI100011","property_path":"getCompetitors.instrumentKey","invalid_value":"INE002A01018"}]}
2026-06-13T07:28:52.149Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Cache saved for ISIN: INE002A01018
2026-06-13T13:06:02.574Z  INFO 7314 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication using Java 21.0.10 with PID 7314 (/root/fundamentals/backend/target/classes started by root in /root/fundamentals/backend)
2026-06-13T13:06:02.578Z  INFO 7314 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-13T13:06:05.180Z  INFO 7314 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-13T13:06:05.203Z  INFO 7314 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-13T13:06:05.204Z  INFO 7314 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-13T13:06:05.376Z  INFO 7314 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-13T13:06:05.377Z  INFO 7314 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2704 ms
2026-06-13T13:06:05.524Z  INFO 7314 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-13T13:06:05.677Z  INFO 7314 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loading instruments from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-13T13:06:07.870Z  INFO 7314 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loaded 17996 instruments (ISINs: 17996, Keys: 139030) from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-13T13:06:08.927Z  INFO 7314 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-13T13:06:08.947Z  INFO 7314 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 7.677 seconds (process running for 8.982)
2026-06-13T13:06:49.022Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-13T13:06:49.026Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-13T13:06:49.032Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 3 ms
2026-06-13T13:06:50.302Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE839G01011
2026-06-13T13:06:51.453Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Cache hit for ISIN: INE839G01011
2026-06-13T13:06:59.886Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.controller.FundamentalController   : Request received for ISIN: INE839G01010
2026-06-13T13:06:59.951Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.service.FundamentalCacheService    : Cache hit for ISIN: INE839G01010
2026-06-13T13:07:08.511Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.controller.FundamentalController   : Request received for ISIN: INE669E01016
2026-06-13T13:07:08.612Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.service.FundamentalCacheService    : Cache hit for ISIN: INE669E01016
2026-06-13T13:09:00.439Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.controller.FundamentalController   : Request received for ISIN: INE043A01012
2026-06-13T13:09:00.451Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE043A01012
2026-06-13T13:09:03.240Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of corporateActions for ISIN: INE043A01012
2026-06-13T13:09:03.311Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of incomeStatement for ISIN: INE043A01012
2026-06-13T13:09:03.367Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of competitors for ISIN: INE043A01012
2026-06-13T13:09:03.420Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of keyRatios for ISIN: INE043A01012
2026-06-13T13:09:03.467Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of profile for ISIN: INE043A01012
2026-06-13T13:09:03.517Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of balanceSheet for ISIN: INE043A01012
2026-06-13T13:09:03.569Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of cashFlow for ISIN: INE043A01012
2026-06-13T13:09:03.620Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of shareHoldings for ISIN: INE043A01012
2026-06-13T13:09:03.688Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.service.FundamentalCacheService    : Cache saved for ISIN: INE043A01012
2026-06-13T13:13:08.511Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-7] c.v.f.controller.FundamentalController   : Request received for ISIN: INE669E01016
2026-06-13T13:13:08.519Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-7] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE669E01016
2026-06-13T13:13:09.511Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of profile for ISIN: INE669E01016
2026-06-13T13:13:09.549Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of balanceSheet for ISIN: INE669E01016
2026-06-13T13:13:09.575Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of incomeStatement for ISIN: INE669E01016
2026-06-13T13:13:09.606Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of cashFlow for ISIN: INE669E01016
2026-06-13T13:13:09.627Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of corporateActions for ISIN: INE669E01016
2026-06-13T13:13:09.646Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of shareHoldings for ISIN: INE669E01016
2026-06-13T13:13:09.666Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of keyRatios for ISIN: INE669E01016
2026-06-13T13:13:09.710Z  INFO 7314 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of competitors for ISIN: INE669E01016
2026-06-13T13:13:09.785Z  INFO 7314 --- [vega.fundamentals] [tomcat-handler-7] c.v.f.service.FundamentalCacheService    : Cache saved for ISIN: INE669E01016
2026-06-13T15:37:00.051Z  INFO 17237 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication using Java 21.0.10 with PID 17237 (/root/fundamentals/backend/target/classes started by root in /root/fundamentals/backend)
2026-06-13T15:37:00.055Z  INFO 17237 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-13T15:37:02.146Z  INFO 17237 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-13T15:37:02.167Z  INFO 17237 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-13T15:37:02.168Z  INFO 17237 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-13T15:37:02.322Z  INFO 17237 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-13T15:37:02.323Z  INFO 17237 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2185 ms
2026-06-13T15:37:02.456Z  INFO 17237 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-13T15:37:02.565Z  INFO 17237 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loading instruments from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-13T15:37:04.378Z  INFO 17237 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loaded 17996 instruments (ISINs: 17996, Keys: 139030) from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-13T15:37:05.230Z  INFO 17237 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-13T15:37:05.250Z  INFO 17237 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 6.365 seconds (process running for 7.32)
2026-06-13T15:37:22.701Z  INFO 17237 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-13T15:37:22.709Z  INFO 17237 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-13T15:37:22.717Z  INFO 17237 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 4 ms
2026-06-13T15:37:24.305Z  INFO 17237 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE839G01010
2026-06-13T15:37:24.313Z  INFO 17237 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE839G01010
2026-06-13T15:37:27.061Z  INFO 17237 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of profile for ISIN: INE839G01010
2026-06-13T15:37:27.123Z  INFO 17237 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of competitors for ISIN: INE839G01010
2026-06-13T15:37:27.137Z  INFO 17237 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of keyRatios for ISIN: INE839G01010
2026-06-13T15:37:27.149Z  INFO 17237 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of incomeStatement for ISIN: INE839G01010
2026-06-13T15:37:27.177Z  INFO 17237 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of balanceSheet for ISIN: INE839G01010
2026-06-13T15:37:27.213Z  INFO 17237 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of cashFlow for ISIN: INE839G01010
2026-06-13T15:37:27.284Z  INFO 17237 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of shareHoldings for ISIN: INE839G01010
2026-06-13T15:37:27.313Z  INFO 17237 --- [vega.fundamentals] [] c.v.f.service.FundamentalHistoryService  : Archived new version of corporateActions for ISIN: INE839G01010
2026-06-13T15:37:27.428Z  INFO 17237 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Cache saved for ISIN: INE839G01010
```

```xml
// File: pom.xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.vega</groupId>
    <artifactId>fundamentals</artifactId>
    <version>0.0.1</version>
    <name>vega.fundamentals</name>
    <description>Vega Fundamentals Service</description>
    <properties>
        <java.version>21</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <finalName>vega.fundamentals.0.0.1</finalName>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

```java
// File: src/main/java/com/vega/fundamentals/VegaFundamentalsApplication.java
package com.vega.fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VegaFundamentalsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VegaFundamentalsApplication.class, args);
    }

}
```

```java
// File: src/main/java/com/vega/fundamentals/client/UpstoxFundamentalClient.java
package com.vega.fundamentals.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.config.UpstoxCredentialManager;
import com.vega.fundamentals.dto.BaseResponseDto;
import com.vega.fundamentals.endpoint.Endpoints;
import com.vega.fundamentals.service.InstrumentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

@Component
@Slf4j
public class UpstoxFundamentalClient {

    private final HttpClient httpClient;
    private final UpstoxCredentialManager credentialManager;
    private final ObjectMapper objectMapper;
    private final InstrumentService instrumentService;

    public UpstoxFundamentalClient(UpstoxCredentialManager credentialManager, ObjectMapper objectMapper, InstrumentService instrumentService) {
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        this.credentialManager = credentialManager;
        this.objectMapper = objectMapper;
        this.instrumentService = instrumentService;
    }

    public <T> T fetch(String isin, String resource, TypeReference<BaseResponseDto<T>> typeReference) {
        String identifier = isin;

        if (Endpoints.COMPETITORS.equals(resource)) {
            String instrumentKey = instrumentService.getCompetitorInstrumentKey(isin);
            if (instrumentKey != null) {
                identifier = instrumentKey;
            } else {
                // Fallback if not found in map
                identifier = "NSE_EQ|" + isin;
            }
        }

        String encodedIdentifier = URLEncoder.encode(identifier, StandardCharsets.UTF_8);
        String url = Endpoints.getUrl(encodedIdentifier, resource);
        String token = credentialManager.getAccessToken();

        if (token == null) {
            log.error("Access token is missing. Cannot fetch data for ISIN: {}", isin);
            return null;
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + token)
                .header("Accept", "application/json")
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                BaseResponseDto<T> baseResponse = objectMapper.readValue(response.body(), typeReference);
                return baseResponse.getData();
            } else {
                log.error("Failed to fetch {} for identifier: {}. Status code: {}. Body: {}", 
                        resource, identifier, response.statusCode(), response.body());
            }
        } catch (IOException | InterruptedException e) {
            log.error("Error fetching {} for identifier: {}: {}", resource, identifier, e.getMessage());
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
        return null;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/config/UpstoxCredentialManager.java
package com.vega.fundamentals.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
@Slf4j
public class UpstoxCredentialManager {

    @Value("${upstox.env-path}")
    private String envPath;

    private String accessToken;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
    public void init() {
        loadCredentials();
    }

    public synchronized void loadCredentials() {
        try {
            File file = new File(envPath);
            if (!file.exists()) {
                log.error("Upstox credentials file not found at: {}", envPath);
                return;
            }

            JsonNode root = objectMapper.readTree(file);
            JsonNode accounts = root.path("accounts");
            
            // Try to find the first account with an accessToken
            if (accounts.isObject()) {
                accounts.fields().forEachRemaining(entry -> {
                    JsonNode account = entry.getValue();
                    if (account.has("accessToken")) {
                        this.accessToken = account.get("accessToken").asText();
                    }
                });
            }

            if (this.accessToken == null || this.accessToken.isEmpty()) {
                log.error("No access token found in Upstox credentials file.");
            } else {
                log.info("Upstox access token loaded successfully.");
            }
        } catch (IOException e) {
            log.error("Failed to load Upstox credentials: {}", e.getMessage());
        }
    }

    public String getAccessToken() {
        return accessToken;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/controller/FundamentalController.java
package com.vega.fundamentals.controller;

import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.service.FundamentalAggregatorService;
import com.vega.fundamentals.service.FundamentalCacheService;
import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/fundamentals")
@RequiredArgsConstructor
@Slf4j
@Validated
public class FundamentalController {

    private final FundamentalAggregatorService aggregatorService;
    private final FundamentalCacheService cacheService;

    @GetMapping("/{isin}")
    public ResponseEntity<FundamentalSnapshot> getFundamentals(
            @PathVariable 
            @Pattern(regexp = "^[A-Z]{2}[A-Z0-9]{9}[0-9]$", message = "Invalid ISIN format")
            String isin) {
        
        log.info("Request received for ISIN: {}", isin);

        Optional<FundamentalSnapshot> cachedSnapshot = cacheService.get(isin);
        if (cachedSnapshot.isPresent()) {
            return ResponseEntity.ok(cachedSnapshot.get());
        }

        FundamentalSnapshot snapshot = aggregatorService.aggregate(isin);
        cacheService.put(isin, snapshot);

        return ResponseEntity.ok(snapshot);
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/BalanceSheetContainer.java
package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanceSheetContainer {
    private BalanceSheetDto consolidated;
    private BalanceSheetDto standalone;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/BalanceSheetDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceSheetDto {
    private Instant fetchedTs;
    private String type;
    @JsonProperty("time_period")
    private String timePeriod;
    @JsonProperty("units_in")
    private String unitsIn;
    private List<BalanceHistoryDto> history;
    @JsonProperty("full_statement")
    private List<StatementItemDto> fullStatement;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class BalanceHistoryDto {
    @JsonProperty("total_asset")
    private Double totalAsset;
    @JsonProperty("total_liability")
    private Double totalLiability;
    private String period;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class StatementItemDto {
    private String particular;
    private List<StatementHistoryDto> history;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class StatementHistoryDto {
    private String period;
    private Double value;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/BaseResponseDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponseDto<T> {
    private String status;
    private T data;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CashFlowContainer.java
package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CashFlowContainer {
    private CashFlowDto consolidated;
    private CashFlowDto standalone;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CashFlowDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlowDto {
    private Instant fetchedTs;
    private String type;
    @JsonProperty("time_period")
    private String timePeriod;
    @JsonProperty("units_in")
    private String unitsIn;
    @JsonProperty("cash_flow")
    private List<CashFlowCategoryDto> cashFlow;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class CashFlowCategoryDto {
    private String category;
    private List<CashFlowHistoryDto> history;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class CashFlowHistoryDto {
    private Double value;
    private String period;
    private String change;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CompanyProfileDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyProfileDto {
    private Instant fetchedTs;
    @JsonProperty("company_profile")
    private String companyProfile;
    
    private String sector;
    
    @JsonProperty("sector_market_cap_inr")
    private MarketCapDto sectorMarketCapInr;
    
    @JsonProperty("sector_market_cap_usd")
    private MarketCapDto sectorMarketCapUsd;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class MarketCapDto {
    private Double value;
    private String unit;
    private String formatted;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CompetitorDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompetitorDto {
    @JsonProperty("instrument_key")
    private String instrumentKey;
    
    private String isin;
    private String symbol;
    @JsonProperty("company_name")
    private String companyName;
    private String exchange;
    
    @JsonProperty("company_profile")
    private String companyProfile;
    private String sector;
    
    @JsonProperty("sector_market_cap_inr")
    private MarketCapDto sectorMarketCapInr;
    @JsonProperty("sector_market_cap_usd")
    private MarketCapDto sectorMarketCapUsd;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CorporateActionDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CorporateActionDto {
    private String name;
    @JsonProperty("expiry_date")
    private String expiryDate;
    private Double amount;
    private String ratio;
    @JsonProperty("event_details")
    private List<EventDetailDto> eventDetails;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class EventDetailDto {
    private String name;
    private String value;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/FundamentalSnapshot.java
package com.vega.fundamentals.dto;

import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class FundamentalSnapshot {
    private String schemaVersion;
    private String status;
    private String source;
    private String isin;
    private String symbol;
    private String companyName;
    private String exchange;
    private Instant generatedTs;
    private Long requestDurationMs;
    private boolean cacheHit;

    private SectionResponse<CompanyProfileDto> profile;
    private SectionResponse<BalanceSheetContainer> balanceSheet;
    private SectionResponse<CashFlowContainer> cashFlow;
    private SectionResponse<IncomeStatementContainer> incomeStatement;
    private SectionResponse<List<ShareHoldingDto>> shareHoldings;
    private SectionResponse<List<KeyRatioDto>> keyRatios;
    private SectionResponse<List<CorporateActionDto>> corporateActions;
    private SectionResponse<List<CompetitorDto>> competitors;

    @Builder.Default
    private Map<String, Object> analysis = new HashMap<>();
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/HistoryRecord.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoryRecord {
    @Builder.Default
    private String schemaVersion = "1.0";
    private long version;
    private Instant ts;
    private String hash;
    private JsonNode data;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/IncomeStatementContainer.java
package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IncomeStatementContainer {
    private IncomeStatementDto consolidated;
    private IncomeStatementDto standalone;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/IncomeStatementDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IncomeStatementDto {
    private Instant fetchedTs;
    private String type;
    @JsonProperty("time_period")
    private String timePeriod;
    @JsonProperty("units_in")
    private String unitsIn;
    @JsonProperty("income_statement")
    private List<IncomeCategoryDto> incomeStatement;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class IncomeCategoryDto {
    private String category;
    private List<IncomeHistoryDto> history;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class IncomeHistoryDto {
    private Double value;
    private String period;
    private String change;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/IsinMetadata.java
package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IsinMetadata {
    @Builder.Default
    private String schemaVersion = "1.0";
    private String isin;
    private String symbol;
    private String companyName;
    private String exchange;
    private Instant createdTs;
    private Instant lastUpdatedTs;

    @Builder.Default
    private Map<String, Long> endpointVersions = new HashMap<>();
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/KeyRatioDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyRatioDto {
    private String name;
    @JsonProperty("company_value")
    private String companyValue;
    @JsonProperty("sector_value")
    private String sectorValue;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/SectionResponse.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionResponse<T> {
    private String status;
    private Instant fetchedTs;
    private Long ageMinutes;
    private Boolean cacheHit;
    private String errorCode;
    private String message;
    private T data;

    public static <T> SectionResponse<T> success(T data) {
        return SectionResponse.<T>builder()
                .status("success")
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> error(String errorCode, String message, T data) {
        return SectionResponse.<T>builder()
                .status("error")
                .errorCode(errorCode)
                .message(message)
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> cached(T data, Instant fetchedTs) {
        return SectionResponse.<T>builder()
                .status("cached")
                .fetchedTs(fetchedTs)
                .cacheHit(true)
                .data(data)
                .build();
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/ShareHoldingDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShareHoldingDto {
    private String category;
    private List<HoldingHistoryDto> history;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class HoldingHistoryDto {
    private String period;
    private Double value;
}
```

```java
// File: src/main/java/com/vega/fundamentals/endpoint/Endpoints.java
package com.vega.fundamentals.endpoint;

public class Endpoints {
    public static final String BASE_URL = "https://api.upstox.com/v2/fundamentals/";
    
    public static final String PROFILE = "profile";
    public static final String BALANCE_SHEET = "balance-sheet?fs=true";
    public static final String CASH_FLOW = "cash-flow";
    public static final String INCOME_STATEMENT = "income-statement";
    public static final String SHARE_HOLDINGS = "share-holdings";
    public static final String KEY_RATIOS = "key-ratios";
    public static final String CORPORATE_ACTIONS = "corporate-actions";
    public static final String COMPETITORS = "competitors";

    public static String getUrl(String identifier, String resource) {
        return BASE_URL + identifier + "/" + resource;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/model/FundamentalEndpoint.java
package com.vega.fundamentals.model;

import com.vega.fundamentals.dto.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum FundamentalEndpoint {
    PROFILE("profile", "profile.jsonl", CompanyProfileDto.class),
    BALANCE_SHEET("balanceSheet", "balanceSheet.jsonl", BalanceSheetContainer.class),
    CASH_FLOW("cashFlow", "cashFlow.jsonl", CashFlowContainer.class),
    INCOME_STATEMENT("incomeStatement", "incomeStatement.jsonl", IncomeStatementContainer.class),
    SHARE_HOLDINGS("shareHoldings", "shareHoldings.jsonl", List.class),
    KEY_RATIOS("keyRatios", "keyRatios.jsonl", List.class),
    CORPORATE_ACTIONS("corporateActions", "corporateActions.jsonl", List.class),
    COMPETITORS("competitors", "competitors.jsonl", List.class);

    private final String key;
    private final String filename;
    private final Class<?> dataType;

    public static FundamentalEndpoint fromKey(String key) {
        for (FundamentalEndpoint endpoint : values()) {
            if (endpoint.key.equals(key)) {
                return endpoint;
            }
        }
        // Fallback to name match for resilience
        for (FundamentalEndpoint endpoint : values()) {
            if (endpoint.name().equalsIgnoreCase(key)) {
                return endpoint;
            }
        }
        throw new IllegalArgumentException("Unknown endpoint key: " + key);
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalAggregatorService.java
package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vega.fundamentals.client.UpstoxFundamentalClient;
import com.vega.fundamentals.dto.*;
import com.vega.fundamentals.endpoint.Endpoints;
import com.vega.fundamentals.util.SectionResponseFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.time.Instant;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalAggregatorService {

    private final UpstoxFundamentalClient client;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;
    private final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public FundamentalSnapshot aggregate(String isin) {
        log.info("Aggregating fundamentals for ISIN: {}", isin);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        InstrumentService.InstrumentInfo instrumentInfo = instrumentService.getInstrument(isin);

        CompletableFuture<SectionResponse<CompanyProfileDto>> profileFuture = fetchAsync(isin, Endpoints.PROFILE, 
                new TypeReference<BaseResponseDto<CompanyProfileDto>>() {}, "profile");

        CompletableFuture<SectionResponse<BalanceSheetContainer>> balanceSheetFuture = fetchAsync(isin, Endpoints.BALANCE_SHEET, 
                new TypeReference<BaseResponseDto<BalanceSheetDto>>() {}, "balanceSheet")
                .thenApply(res -> wrapContainer(res, BalanceSheetContainer.class));

        CompletableFuture<SectionResponse<CashFlowContainer>> cashFlowFuture = fetchAsync(isin, Endpoints.CASH_FLOW, 
                new TypeReference<BaseResponseDto<CashFlowDto>>() {}, "cashFlow")
                .thenApply(res -> wrapContainer(res, CashFlowContainer.class));

        CompletableFuture<SectionResponse<IncomeStatementContainer>> incomeStatementFuture = fetchAsync(isin, Endpoints.INCOME_STATEMENT, 
                new TypeReference<BaseResponseDto<IncomeStatementDto>>() {}, "incomeStatement")
                .thenApply(res -> wrapContainer(res, IncomeStatementContainer.class));

        CompletableFuture<SectionResponse<List<ShareHoldingDto>>> shareHoldingsFuture = fetchAsync(isin, Endpoints.SHARE_HOLDINGS, 
                new TypeReference<BaseResponseDto<List<ShareHoldingDto>>>() {}, "shareHoldings");

        CompletableFuture<SectionResponse<List<KeyRatioDto>>> keyRatiosFuture = fetchAsync(isin, Endpoints.KEY_RATIOS, 
                new TypeReference<BaseResponseDto<List<KeyRatioDto>>>() {}, "keyRatios");

        CompletableFuture<SectionResponse<List<CorporateActionDto>>> corporateActionsFuture = fetchAsync(isin, Endpoints.CORPORATE_ACTIONS, 
                new TypeReference<BaseResponseDto<List<CorporateActionDto>>>() {}, "corporateActions");

        CompletableFuture<SectionResponse<List<CompetitorDto>>> competitorsFuture = fetchAsync(isin, Endpoints.COMPETITORS, 
                new TypeReference<BaseResponseDto<List<CompetitorDto>>>() {}, "competitors")
                .thenApply(this::enrichCompetitors);

        CompletableFuture.allOf(
                profileFuture, balanceSheetFuture, cashFlowFuture, incomeStatementFuture,
                shareHoldingsFuture, keyRatiosFuture, corporateActionsFuture, competitorsFuture
        ).join();

        stopWatch.stop();

        SectionResponse<CompanyProfileDto> profileRes = profileFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", null));
        String companyName = instrumentInfo != null ? instrumentInfo.getName() : null;

        FundamentalSnapshot snapshot = FundamentalSnapshot.builder()
                .schemaVersion("2.0")
                .status("success")
                .source("UPSTOX")
                .isin(isin)
                .symbol(instrumentInfo != null ? instrumentInfo.getSymbol() : null)
                .companyName(companyName)
                .exchange(instrumentInfo != null ? instrumentInfo.getExchange() : null)
                .generatedTs(Instant.now())
                .requestDurationMs(stopWatch.getTotalTimeMillis())
                .cacheHit(false)
                .profile(profileRes)
                .balanceSheet(balanceSheetFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", null)))
                .cashFlow(cashFlowFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", null)))
                .incomeStatement(incomeStatementFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", null)))
                .shareHoldings(shareHoldingsFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", List.of())))
                .keyRatios(keyRatiosFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", List.of())))
                .corporateActions(corporateActionsFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", List.of())))
                .competitors(competitorsFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", List.of())))
                .build();

        boolean anyError = List.of(snapshot.getProfile(), snapshot.getBalanceSheet(), snapshot.getCashFlow(), 
                snapshot.getIncomeStatement(), snapshot.getShareHoldings(), snapshot.getKeyRatios(), 
                snapshot.getCorporateActions(), snapshot.getCompetitors())
                .stream().anyMatch(res -> "error".equals(res.getStatus()));
        
        if (anyError) {
            snapshot.setStatus("partial_success");
        }

        snapshot.setAnalysis(analyzer.analyze(snapshot));

        // Archive changes to JSONL history
        historyService.archiveSnapshot(snapshot);

        return snapshot;
    }

    private <T> CompletableFuture<SectionResponse<T>> fetchAsync(String isin, String endpoint, TypeReference<BaseResponseDto<T>> type, String name) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                T result = client.fetch(isin, endpoint, type);
                if (result != null) {
                    return SectionResponseFactory.success(result);
                } else {
                    return SectionResponseFactory.error("UPSTOX_FETCH_ERROR", "Failed to fetch " + name, null);
                }
            } catch (Exception e) {
                log.error("Error fetching {} for ISIN: {}: {}", name, isin, e.getMessage());
                return SectionResponseFactory.error("EXCEPTION", e.getMessage(), null);
            }
        }, executor);
    }

    private SectionResponse<List<CompetitorDto>> enrichCompetitors(SectionResponse<List<CompetitorDto>> sectionRes) {
        if (!"success".equals(sectionRes.getStatus()) || sectionRes.getData() == null) {
            return sectionRes;
        }

        for (CompetitorDto competitor : sectionRes.getData()) {
            InstrumentService.InstrumentInfo info = instrumentService.getByInstrumentKey(competitor.getInstrumentKey());
            if (info != null) {
                competitor.setIsin(info.getIsin());
                competitor.setSymbol(info.getSymbol());
                competitor.setCompanyName(info.getName());
                competitor.setExchange(info.getExchange());
            }
        }
        return sectionRes;
    }

    @SuppressWarnings("unchecked")
    private <T, C> SectionResponse<C> wrapContainer(SectionResponse<T> sectionRes, Class<C> containerClass) {
        if ("error".equals(sectionRes.getStatus())) {
            return SectionResponseFactory.error(sectionRes.getErrorCode(), sectionRes.getMessage(), null);
        }
        
        try {
            C container = containerClass.getDeclaredConstructor().newInstance();
            if (sectionRes.getData() != null) {
                containerClass.getMethod("setConsolidated", sectionRes.getData().getClass()).invoke(container, sectionRes.getData());
            }
            return SectionResponseFactory.success(container);
        } catch (Exception e) {
            return SectionResponseFactory.error("CONTAINER_ERROR", e.getMessage(), null);
        }
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalAnalyzer.java
package com.vega.fundamentals.service;

import com.vega.fundamentals.dto.FundamentalSnapshot;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FundamentalAnalyzer {

    public Map<String, Object> analyze(FundamentalSnapshot snapshot) {
        Map<String, Object> analysis = new HashMap<>();
        
        // Placeholder scoring logic
        int profitability = 65;
        int financialHealth = 45;
        int valuation = 75;
        int ownership = 50;
        int overallScore = (profitability + financialHealth + valuation + ownership) / 4;

        analysis.put("profitability", profitability);
        analysis.put("financialHealth", financialHealth);
        analysis.put("valuation", valuation);
        analysis.put("ownership", ownership);
        analysis.put("overallScore", overallScore);

        return analysis;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalCacheService.java
package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.dto.*;
import com.vega.fundamentals.util.SectionResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FundamentalCacheService {

    private final String cachePath;
    private final ObjectMapper objectMapper;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;
    private static final Duration TTL = Duration.ofHours(24);

    public FundamentalCacheService(@Value("${storage.cache.fundamentals-path}") String cachePath, 
                                 ObjectMapper objectMapper,
                                 InstrumentService instrumentService,
                                 FundamentalAnalyzer analyzer,
                                 FundamentalHistoryService historyService) {
        this.cachePath = cachePath;
        this.objectMapper = objectMapper;
        this.instrumentService = instrumentService;
        this.analyzer = analyzer;
        this.historyService = historyService;
    }

    public Optional<FundamentalSnapshot> get(String isin) {
        // 1. Try Primary JSON Cache
        Optional<FundamentalSnapshot> cached = getFromPrimaryCache(isin);
        if (cached.isPresent()) return cached;

        // 2. Fallback to History Reconstruction (Stage 1.5)
        log.info("Primary cache miss for ISIN: {}. Attempting history reconstruction...", isin);
        Optional<FundamentalSnapshot> historical = historyService.reconstructSnapshot(isin);
        if (historical.isPresent()) {
            FundamentalSnapshot snapshot = historical.get();
            if (isFresh(snapshot.getGeneratedTs())) {
                log.info("History hit and fresh for ISIN: {}", isin);
                snapshot.setAnalysis(analyzer.analyze(snapshot));
                return Optional.of(snapshot);
            } else {
                log.info("History hit but expired for ISIN: {}", isin);
            }
        }

        return Optional.empty();
    }

    private Optional<FundamentalSnapshot> getFromPrimaryCache(String isin) {
        Path isinDir = Path.of(cachePath, isin);
        if (!Files.exists(isinDir) || !Files.exists(isinDir.resolve("profile.json"))) {
            return Optional.empty();
        }

        try {
            SectionResponse<CompanyProfileDto> profileRes = readSection(isinDir, "profile.json", new TypeReference<SectionResponse<CompanyProfileDto>>() {});
            if (profileRes == null || !isFresh(profileRes.getFetchedTs())) {
                log.info("Primary cache expired or missing for ISIN: {}", isin);
                return Optional.empty();
            }

            InstrumentService.InstrumentInfo instrumentInfo = instrumentService.getInstrument(isin);
            FundamentalSnapshot snapshot = buildSnapshotFromCache(isin, isinDir, profileRes, instrumentInfo);

            if (isPartialSuccess(snapshot)) {
                snapshot.setStatus("partial_success");
            }

            snapshot.setAnalysis(analyzer.analyze(snapshot));
            log.info("Primary cache hit for ISIN: {}", isin);
            return Optional.of(snapshot);
        } catch (IOException e) {
            log.error("Failed to read primary cache for ISIN: {}: {}", isin, e.getMessage());
            return Optional.empty();
        }
    }

    private FundamentalSnapshot buildSnapshotFromCache(String isin, Path isinDir, SectionResponse<CompanyProfileDto> profileRes, InstrumentService.InstrumentInfo instrumentInfo) throws IOException {
        String companyName = instrumentInfo != null ? instrumentInfo.getName() : null;

        FundamentalSnapshot.FundamentalSnapshotBuilder builder = FundamentalSnapshot.builder()
                .schemaVersion("2.0")
                .isin(isin)
                .symbol(instrumentInfo != null ? instrumentInfo.getSymbol() : null)
                .companyName(companyName)
                .exchange(instrumentInfo != null ? instrumentInfo.getExchange() : null)
                .cacheHit(true)
                .status("success")
                .source("UPSTOX")
                .generatedTs(profileRes.getFetchedTs())
                .profile(SectionResponseFactory.cached(profileRes.getData(), profileRes.getFetchedTs()));

        builder.balanceSheet(readAndWrapCached(isinDir, "balanceSheet.json", new TypeReference<SectionResponse<BalanceSheetContainer>>() {}));
        builder.cashFlow(readAndWrapCached(isinDir, "cashFlow.json", new TypeReference<SectionResponse<CashFlowContainer>>() {}));
        builder.incomeStatement(readAndWrapCached(isinDir, "incomeStatement.json", new TypeReference<SectionResponse<IncomeStatementContainer>>() {}));
        
        builder.shareHoldings(readAndWrapCached(isinDir, "shareHoldings.json", new TypeReference<SectionResponse<List<ShareHoldingDto>>>() {}));
        builder.keyRatios(readAndWrapCached(isinDir, "keyRatios.json", new TypeReference<SectionResponse<List<KeyRatioDto>>>() {}));
        builder.corporateActions(readAndWrapCached(isinDir, "corporateActions.json", new TypeReference<SectionResponse<List<CorporateActionDto>>>() {}));
        
        SectionResponse<List<CompetitorDto>> competitorsRes = readAndWrapCached(isinDir, "competitors.json", new TypeReference<SectionResponse<List<CompetitorDto>>>() {});
        builder.competitors(enrichCompetitors(competitorsRes));

        return builder.build();
    }

    private boolean isPartialSuccess(FundamentalSnapshot snapshot) {
        return List.of(snapshot.getProfile(), snapshot.getBalanceSheet(), snapshot.getCashFlow(), 
                snapshot.getIncomeStatement(), snapshot.getShareHoldings(), snapshot.getKeyRatios(), 
                snapshot.getCorporateActions(), snapshot.getCompetitors())
                .stream().anyMatch(res -> "error".equals(res.getStatus()));
    }

    private SectionResponse<List<CompetitorDto>> enrichCompetitors(SectionResponse<List<CompetitorDto>> sectionRes) {
        if (!"cached".equals(sectionRes.getStatus()) && !"success".equals(sectionRes.getStatus())) {
            return sectionRes;
        }
        if (sectionRes.getData() == null) return sectionRes;

        for (CompetitorDto competitor : sectionRes.getData()) {
            InstrumentService.InstrumentInfo info = instrumentService.getByInstrumentKey(competitor.getInstrumentKey());
            if (info != null) {
                competitor.setIsin(info.getIsin());
                competitor.setSymbol(info.getSymbol());
                competitor.setCompanyName(info.getName());
                competitor.setExchange(info.getExchange());
            }
        }
        return sectionRes;
    }

    public void put(String isin, FundamentalSnapshot snapshot) {
        Path isinDir = Path.of(cachePath, isin);
        try {
            Files.createDirectories(isinDir);
            
            writeSection(isinDir, "profile.json", snapshot.getProfile());
            writeSection(isinDir, "balanceSheet.json", snapshot.getBalanceSheet());
            writeSection(isinDir, "cashFlow.json", snapshot.getCashFlow());
            writeSection(isinDir, "incomeStatement.json", snapshot.getIncomeStatement());
            writeSection(isinDir, "shareHoldings.json", snapshot.getShareHoldings());
            writeSection(isinDir, "keyRatios.json", snapshot.getKeyRatios());
            writeSection(isinDir, "corporateActions.json", snapshot.getCorporateActions());
            writeSection(isinDir, "competitors.json", snapshot.getCompetitors());
            
            log.info("Cache saved for ISIN: {}", isin);
        } catch (IOException e) {
            log.error("Failed to save cache for ISIN: {}: {}", isin, e.getMessage());
        }
    }

    private <T> T readSection(Path dir, String filename, TypeReference<T> type) throws IOException {
        File file = dir.resolve(filename).toFile();
        if (file.exists()) {
            return objectMapper.readValue(file, type);
        }
        return null;
    }

    private <T> SectionResponse<T> readAndWrapCached(Path dir, String filename, TypeReference<SectionResponse<T>> type) throws IOException {
        SectionResponse<T> res = readSection(dir, filename, type);
        if (res != null) {
            if ("success".equals(res.getStatus()) || "cached".equals(res.getStatus())) {
                return SectionResponseFactory.cached(res.getData(), res.getFetchedTs());
            }
            return res;
        }
        return SectionResponseFactory.error("CACHE_MISS", "Section missing in cache", null);
    }

    private void writeSection(Path dir, String filename, Object data) throws IOException {
        if (data != null) {
            objectMapper.writeValue(dir.resolve(filename).toFile(), data);
        }
    }

    private boolean isFresh(Instant ts) {
        if (ts == null) return false;
        return Duration.between(ts, Instant.now()).compareTo(TTL) < 0;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalHistoryService.java
package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.dto.HistoryRecord;
import com.vega.fundamentals.dto.IsinMetadata;
import com.vega.fundamentals.dto.SectionResponse;
import com.vega.fundamentals.model.FundamentalEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Service
@Slf4j
public class FundamentalHistoryService {

    private final String historyPath;
    private final ObjectMapper objectMapper;
    private final ConcurrentHashMap<String, ReentrantLock> locks = new ConcurrentHashMap<>();

    public FundamentalHistoryService(@Value("${storage.history.fundamentals-path}") String historyPath, ObjectMapper objectMapper) {
        this.historyPath = historyPath;
        this.objectMapper = objectMapper.copy();
        this.objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    }

    /**
     * Archives all changed sections of a snapshot.
     */
    public void archiveSnapshot(FundamentalSnapshot snapshot) {
        if (snapshot == null || snapshot.getIsin() == null) return;

        String isin = snapshot.getIsin();
        ReentrantLock lock = locks.computeIfAbsent(isin, k -> new ReentrantLock());
        lock.lock();
        try {
            Path isinHistoryDir = Path.of(historyPath, isin);
            Files.createDirectories(isinHistoryDir);
            
            rebuildIndexIfMissing(isin);
            IsinMetadata metadata = updateIsinMetadata(snapshot);

            for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
                SectionResponse<?> section = getSection(snapshot, endpoint);
                archiveIfChanged(isin, endpoint, section, metadata);
            }
            
            saveIsinMetadata(isin, metadata);

        } catch (Exception e) {
            log.error("Failed to archive snapshot for ISIN {}: {}", isin, e.getMessage());
        } finally {
            lock.unlock();
        }
    }

    private SectionResponse<?> getSection(FundamentalSnapshot snapshot, FundamentalEndpoint endpoint) {
        return switch (endpoint) {
            case PROFILE -> snapshot.getProfile();
            case BALANCE_SHEET -> snapshot.getBalanceSheet();
            case CASH_FLOW -> snapshot.getCashFlow();
            case INCOME_STATEMENT -> snapshot.getIncomeStatement();
            case SHARE_HOLDINGS -> snapshot.getShareHoldings();
            case KEY_RATIOS -> snapshot.getKeyRatios();
            case CORPORATE_ACTIONS -> snapshot.getCorporateActions();
            case COMPETITORS -> snapshot.getCompetitors();
        };
    }

    private void archiveIfChanged(String isin, FundamentalEndpoint endpoint, SectionResponse<?> section, IsinMetadata metadata) {
        if (section == null || !"success".equals(section.getStatus()) || section.getData() == null) {
            return;
        }

        try {
            JsonNode dataNode = objectMapper.valueToTree(section.getData());
            JsonNode normalizedNode = normalize(dataNode);
            String currentHash = generateHash(normalizedNode);

            File indexFile = Path.of(historyPath, isin, "latest-index.json").toFile();
            Map<String, HistoryIndexEntry> index = loadIndex(indexFile);

            HistoryIndexEntry lastEntry = index.get(endpoint.getKey());

            if (lastEntry != null && currentHash.equals(lastEntry.getHash())) {
                log.debug("No change detected for {} (ISIN: {}). Skipping archive.", endpoint.getKey(), isin);
                return;
            }

            // Data has changed, archive it
            long nextVersion = (lastEntry != null) ? lastEntry.getVersion() + 1 : 1;
            HistoryRecord record = HistoryRecord.builder()
                    .version(nextVersion)
                    .ts(Instant.now())
                    .hash(currentHash)
                    .data(dataNode)
                    .build();

            appendHistory(Path.of(historyPath, isin), endpoint, record);

            // Update index and metadata
            index.put(endpoint.getKey(), new HistoryIndexEntry(currentHash, nextVersion, record.getTs()));
            saveIndex(indexFile, index);
            
            metadata.getEndpointVersions().put(endpoint.getKey(), nextVersion);
            metadata.setLastUpdatedTs(record.getTs());

            log.info("Archived v{} of {} for ISIN: {}", nextVersion, endpoint.getKey(), isin);

        } catch (Exception e) {
            log.error("Failed to archive {} for ISIN {}: {}", endpoint.getKey(), isin, e.getMessage());
        }
    }

    private IsinMetadata updateIsinMetadata(FundamentalSnapshot snapshot) throws IOException {
        Path isinDir = Path.of(historyPath, snapshot.getIsin());
        File metadataFile = isinDir.resolve("metadata.json").toFile();

        IsinMetadata metadata;
        if (metadataFile.exists()) {
            metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
            metadata.setSymbol(snapshot.getSymbol());
            metadata.setCompanyName(snapshot.getCompanyName());
            metadata.setExchange(snapshot.getExchange());
        } else {
            metadata = IsinMetadata.builder()
                    .isin(snapshot.getIsin())
                    .symbol(snapshot.getSymbol())
                    .companyName(snapshot.getCompanyName())
                    .exchange(snapshot.getExchange())
                    .createdTs(Instant.now())
                    .lastUpdatedTs(Instant.now())
                    .build();
        }
        return metadata;
    }

    private void saveIsinMetadata(String isin, IsinMetadata metadata) throws IOException {
        File metadataFile = Path.of(historyPath, isin, "metadata.json").toFile();
        objectMapper.writeValue(metadataFile, metadata);
    }

    private void rebuildIndexIfMissing(String isin) {
        Path isinDir = Path.of(historyPath, isin);
        File indexFile = isinDir.resolve("latest-index.json").toFile();
        if (indexFile.exists()) return;

        log.info("latest-index.json missing for ISIN: {}. Rebuilding from history...", isin);
        Map<String, HistoryIndexEntry> index = new HashMap<>();
        
        for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
            HistoryRecord latest = readLatestRecord(isin, endpoint);
            if (latest != null) {
                index.put(endpoint.getKey(), new HistoryIndexEntry(latest.getHash(), latest.getVersion(), latest.getTs()));
            }
        }

        if (!index.isEmpty()) {
            try {
                saveIndex(indexFile, index);
                log.info("Successfully rebuilt index for ISIN: {} with {} entries.", isin, index.size());
            } catch (IOException e) {
                log.error("Failed to save rebuilt index for ISIN {}: {}", isin, e.getMessage());
            }
        }
    }

    private JsonNode normalize(JsonNode node) {
        if (node == null) return null;
        if (node.isArray()) {
            // Handle lists of objects (like shareholdings, competitors)
            com.fasterxml.jackson.databind.node.ArrayNode normalizedArray = objectMapper.createArrayNode();
            for (JsonNode item : node) {
                normalizedArray.add(normalize(item));
            }
            return normalizedArray;
        }
        if (!node.isObject()) return node;
        
        ObjectNode normalized = node.deepCopy();
        // Remove common volatile fields
        normalized.remove("fetchedTs");
        normalized.remove("generatedTs");
        normalized.remove("cacheHit");
        normalized.remove("ageMinutes");
        normalized.remove("requestDurationMs");
        normalized.remove("status");
        normalized.remove("message");
        normalized.remove("errorCode");
        
        // Recursively normalize children to catch leaked timestamps in nested objects
        java.util.Iterator<Map.Entry<String, JsonNode>> fields = normalized.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            normalized.set(field.getKey(), normalize(field.getValue()));
        }
        
        return normalized;
    }

    private String generateHash(JsonNode node) throws NoSuchAlgorithmException, JsonProcessingException {
        String canonicalJson = objectMapper.writeValueAsString(node);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(canonicalJson.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    private Map<String, HistoryIndexEntry> loadIndex(File indexFile) {
        if (!indexFile.exists()) return new HashMap<>();
        try {
            return objectMapper.readValue(indexFile, new TypeReference<Map<String, HistoryIndexEntry>>() {});
        } catch (IOException e) {
            log.warn("Failed to load history index: {}", e.getMessage());
            return new HashMap<>();
        }
    }

    private void saveIndex(File indexFile, Map<String, HistoryIndexEntry> index) throws IOException {
        objectMapper.writeValue(indexFile, index);
    }

    private void appendHistory(Path dir, FundamentalEndpoint endpoint, HistoryRecord record) throws IOException {
        File historyFile = dir.resolve(endpoint.getFilename()).toFile();
        String line = objectMapper.writeValueAsString(record);
        try (FileWriter fw = new FileWriter(historyFile, true)) {
            fw.write(line + "\n");
        }
    }

    public Optional<FundamentalSnapshot> reconstructSnapshot(String isin) {
        Path isinDir = Path.of(historyPath, isin);
        if (!Files.exists(isinDir)) return Optional.empty();

        File metadataFile = isinDir.resolve("metadata.json").toFile();
        if (!metadataFile.exists()) return Optional.empty();

        try {
            IsinMetadata metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);

            FundamentalSnapshot.FundamentalSnapshotBuilder builder = FundamentalSnapshot.builder()
                    .schemaVersion("2.0")
                    .status("success")
                    .source("HISTORY")
                    .isin(isin)
                    .symbol(metadata.getSymbol())
                    .companyName(metadata.getCompanyName())
                    .exchange(metadata.getExchange())
                    .generatedTs(metadata.getLastUpdatedTs())
                    .cacheHit(true);

            builder.profile(reconstructSection(isin, FundamentalEndpoint.PROFILE));
            builder.balanceSheet(reconstructSection(isin, FundamentalEndpoint.BALANCE_SHEET));
            builder.cashFlow(reconstructSection(isin, FundamentalEndpoint.CASH_FLOW));
            builder.incomeStatement(reconstructSection(isin, FundamentalEndpoint.INCOME_STATEMENT));
            builder.shareHoldings(reconstructSection(isin, FundamentalEndpoint.SHARE_HOLDINGS));
            builder.keyRatios(reconstructSection(isin, FundamentalEndpoint.KEY_RATIOS));
            builder.corporateActions(reconstructSection(isin, FundamentalEndpoint.CORPORATE_ACTIONS));
            builder.competitors(reconstructSection(isin, FundamentalEndpoint.COMPETITORS));

            FundamentalSnapshot snapshot = builder.build();
            return Optional.of(snapshot);

        } catch (IOException e) {
            log.error("Failed to reconstruct snapshot for ISIN {}: {}", isin, e.getMessage());
            return Optional.empty();
        }
    }

    @SuppressWarnings("unchecked")
    private <T> SectionResponse<T> reconstructSection(String isin, FundamentalEndpoint endpoint) {
        HistoryRecord record = readLatestRecord(isin, endpoint);
        if (record == null) {
            return (SectionResponse<T>) SectionResponse.builder()
                    .status("error")
                    .errorCode("HISTORY_MISSING")
                    .message("No historical data found for " + endpoint.getKey())
                    .build();
        }

        try {
            T data = (T) objectMapper.convertValue(record.getData(), endpoint.getDataType());
            return SectionResponse.cached(data, record.getTs());
        } catch (Exception e) {
            log.error("Failed to deserialize {} for ISIN {}: {}", endpoint.getKey(), isin, e.getMessage());
            return (SectionResponse<T>) SectionResponse.builder()
                    .status("error")
                    .errorCode("DESERIALIZATION_ERROR")
                    .message("Failed to deserialize " + endpoint.getKey())
                    .build();
        }
    }

    public HistoryRecord readLatestRecord(String isin, FundamentalEndpoint endpoint) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try {
            String lastLine = readLastLine(historyFile.toFile());
            if (lastLine != null) {
                return objectMapper.readValue(lastLine, HistoryRecord.class);
            }
        } catch (IOException e) {
            log.error("Failed to read latest record for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private String readLastLine(File file) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long length = raf.length();
            if (length <= 0) return null;

            long pos = length - 1;
            // Skip trailing newlines
            raf.seek(pos);
            while (pos > 0 && raf.readByte() == '\n') {
                pos--;
                raf.seek(pos);
            }

            while (pos >= 0) {
                raf.seek(pos);
                if (pos == 0 || raf.readByte() == '\n') {
                    if (pos > 0) raf.seek(pos + 1);
                    else raf.seek(0);

                    byte[] bytes = new byte[(int) (length - (pos == 0 ? 0 : pos + 1))];
                    raf.readFully(bytes);
                    String line = new String(bytes, StandardCharsets.UTF_8).trim();
                    return line.isEmpty() ? null : line;
                }
                pos--;
            }
        }
        return null;
    }

    @lombok.Data
    @lombok.AllArgsConstructor
    @lombok.NoArgsConstructor
    public static class HistoryIndexEntry {
        private String hash;
        private long version;
        private Instant ts;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/InstrumentService.java
package com.vega.fundamentals.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class InstrumentService {

    private final String instrumentPath;
    private final ObjectMapper objectMapper;
    private final Map<String, InstrumentInfo> isinMap = new HashMap<>();
    private final Map<String, InstrumentInfo> instrumentKeyMap = new HashMap<>();

    public InstrumentService(@Value("${upstox.instrument-path}") String instrumentPath, ObjectMapper objectMapper) {
        this.instrumentPath = instrumentPath;
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    public void init() {
        log.info("Loading instruments from {}", instrumentPath);
        File file = new File(instrumentPath);
        if (!file.exists()) {
            log.warn("Instrument file not found at {}", instrumentPath);
            return;
        }

        try {
            JsonNode root = objectMapper.readTree(file);
            if (root.isArray()) {
                for (JsonNode node : root) {
                    String isin = node.path("isin").asText(null);
                    String instrumentKey = node.path("instrument_key").asText(null);
                    
                    InstrumentInfo info = new InstrumentInfo();
                    info.setIsin(isin);
                    info.setSymbol(node.path("trading_symbol").asText(node.path("asset_symbol").asText()));
                    info.setName(node.path("name").asText(null));
                    info.setExchange(node.path("exchange").asText());
                    info.setInstrumentKey(instrumentKey);

                    if (isin != null && !isin.isEmpty()) {
                        isinMap.put(isin, info);
                    }
                    if (instrumentKey != null && !instrumentKey.isEmpty()) {
                        instrumentKeyMap.put(instrumentKey, info);
                    }
                }
            }
            log.info("Loaded {} instruments (ISINs: {}, Keys: {}) from {}", 
                    isinMap.size(), isinMap.size(), instrumentKeyMap.size(), instrumentPath);
        } catch (IOException e) {
            log.error("Failed to load instruments: {}", e.getMessage());
        }
    }

    public InstrumentInfo getInstrument(String isin) {
        return isinMap.get(isin);
    }

    public InstrumentInfo getByInstrumentKey(String instrumentKey) {
        return instrumentKeyMap.get(instrumentKey);
    }

    public String getCompetitorInstrumentKey(String isin) {
        InstrumentInfo info = isinMap.get(isin);
        if (info == null) {
            return null;
        }
        if (info.getInstrumentKey() != null && !info.getInstrumentKey().isBlank()) {
            return info.getInstrumentKey();
        }
        return info.getExchange() + "|" + isin;
    }

    @Data
    public static class InstrumentInfo {
        private String isin;
        private String symbol;
        private String name;
        private String exchange;
        private String instrumentKey;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/util/GlobalExceptionHandler.java
package com.vega.fundamentals.util;

import jakarta.validation.ConstraintViolationException;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(ConstraintViolationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.builder()
                        .status("error")
                        .message(e.getMessage())
                        .build());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleAllExceptions(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse.builder()
                        .status("error")
                        .message("An unexpected error occurred: " + e.getMessage())
                        .build());
    }

    @Data
    @Builder
    public static class ErrorResponse {
        private String status;
        private String message;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/util/SectionResponseFactory.java
package com.vega.fundamentals.util;

import com.vega.fundamentals.dto.SectionResponse;
import java.time.Duration;
import java.time.Instant;

public class SectionResponseFactory {

    public static <T> SectionResponse<T> success(T data) {
        return SectionResponse.<T>builder()
                .status("success")
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> error(String errorCode, String message, T data) {
        return SectionResponse.<T>builder()
                .status("error")
                .errorCode(errorCode)
                .message(message)
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> cached(T data, Instant fetchedTs) {
        SectionResponse<T> response = SectionResponse.<T>builder()
                .status("cached")
                .fetchedTs(fetchedTs)
                .cacheHit(true)
                .data(data)
                .build();
        
        if (fetchedTs != null) {
            response.setAgeMinutes(Duration.between(fetchedTs, Instant.now()).toMinutes());
        }
        
        return response;
    }
}
```

```yaml
// File: src/main/resources/application.yml
server:
  port: 8080
  compression:
    enabled: true
    mime-types: application/json

spring:
  application:
    name: vega.fundamentals
  threads:
    virtual:
      enabled: true

logging:
  file:
    name: logs/vega-fundamentals.log
  level:
    com.vega.fundamentals: INFO

upstox:
  env-path: /root/fundamentals/auth/upstox/auth.upstox.json
  instrument-path: /root/fundamentals/data/instruments/upstox/upstox.json

storage:
  cache:
    fundamentals-path: /root/fundamentals/storage/cache/fundamentals/
  history:
    fundamentals-path: /root/fundamentals/storage/history/fundamentals/
```
