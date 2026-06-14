```
// File: logs/vega-fundamentals.log
2026-06-14T02:24:17.010Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication using Java 21.0.10 with PID 22799 (/root/fundamentals/backend/target/classes started by root in /root/fundamentals/backend)
2026-06-14T02:24:17.015Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-14T02:24:19.251Z  INFO 22799 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-14T02:24:19.269Z  INFO 22799 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-14T02:24:19.270Z  INFO 22799 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-14T02:24:19.426Z  INFO 22799 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-14T02:24:19.427Z  INFO 22799 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2319 ms
2026-06-14T02:24:19.564Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-14T02:24:19.683Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loading instruments from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T02:24:21.621Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loaded 17996 instruments (ISINs: 17996, Keys: 139030) from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T02:24:22.848Z  INFO 22799 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-14T02:24:22.863Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 7.049 seconds (process running for 7.979)
2026-06-14T02:24:43.971Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-14T02:24:43.974Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-14T02:24:43.979Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 3 ms
2026-06-14T02:24:44.717Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE839G01010
2026-06-14T02:24:44.719Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE839G01010...
2026-06-14T02:24:44.722Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE839G01010
2026-06-14T02:24:47.178Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : metadata.json missing or new ISIN: INE839G01010. Initializing...
2026-06-14T02:24:47.482Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.498Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.514Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.526Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.537Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.542Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.549Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.560Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE839G01010 (offset: 0)
2026-06-14T03:40:56.732Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-14T03:40:56.738Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE002A01018...
2026-06-14T03:40:56.741Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE002A01018
2026-06-14T03:40:57.444Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : metadata.json missing or new ISIN: INE002A01018. Initializing...
2026-06-14T03:40:57.480Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.510Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.518Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.525Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.530Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.534Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.537Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.542Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:41:37.275Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.controller.FundamentalController   : Request received for ISIN: INE397D01024
2026-06-14T03:41:37.280Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE397D01024...
2026-06-14T03:41:37.288Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE397D01024
2026-06-14T03:41:37.932Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : metadata.json missing or new ISIN: INE397D01024. Initializing...
2026-06-14T03:41:37.955Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:37.991Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.005Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.021Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.037Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.053Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.066Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.080Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:42:00.072Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.controller.FundamentalController   : Request received for ISIN: IN9397D01014
2026-06-14T03:42:00.074Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: IN9397D01014...
2026-06-14T03:42:00.075Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: IN9397D01014
2026-06-14T03:42:00.475Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : metadata.json missing or new ISIN: IN9397D01014. Initializing...
2026-06-14T03:42:00.492Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.500Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.511Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.523Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.532Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.541Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.549Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.575Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: IN9397D01014 (offset: 0)
2026-06-14T04:15:13.411Z  INFO 13486 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication using Java 21.0.10 with PID 13486 (/root/fundamentals/backend/target/classes started by root in /root/fundamentals/backend)
2026-06-14T04:15:13.416Z  INFO 13486 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-14T04:15:16.052Z  INFO 13486 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-14T04:15:16.071Z  INFO 13486 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-14T04:15:16.072Z  INFO 13486 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-14T04:15:16.232Z  INFO 13486 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-14T04:15:16.233Z  INFO 13486 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2694 ms
2026-06-14T04:15:16.395Z  INFO 13486 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-14T04:15:16.538Z  INFO 13486 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loading instruments from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T04:15:18.139Z  INFO 13486 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loaded 17996 instruments (ISINs: 17996, Keys: 139030) from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T04:15:19.109Z  INFO 13486 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-14T04:15:19.144Z  INFO 13486 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 7.108 seconds (process running for 8.254)
2026-06-14T04:15:36.010Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-14T04:15:36.012Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-14T04:15:36.014Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
2026-06-14T04:15:37.091Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE397D01024
2026-06-14T04:15:37.095Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE397D01024...
2026-06-14T04:15:47.351Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE397D01024
2026-06-14T04:16:22.241Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.controller.FundamentalController   : Request received for ISIN: INE742F01042
2026-06-14T04:16:22.250Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE742F01042...
2026-06-14T04:16:22.255Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE742F01042
2026-06-14T04:16:24.192Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE742F01042. Rebuilding from history...
2026-06-14T04:16:24.220Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:16:24.231Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:16:24.243Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:16:24.249Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:16:24.260Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:16:24.264Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:16:24.273Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:16:24.280Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:16:34.659Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.controller.FundamentalController   : Request received for ISIN: INE397D01024
2026-06-14T04:16:34.660Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE397D01024...
2026-06-14T04:16:55.231Z  INFO 13486 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE397D01024
2026-06-14T04:27:53.142Z  INFO 17415 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication using Java 21.0.10 with PID 17415 (/root/fundamentals/backend/target/classes started by root in /root/fundamentals/backend)
2026-06-14T04:27:53.145Z  INFO 17415 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-14T04:27:55.913Z  INFO 17415 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-14T04:27:55.937Z  INFO 17415 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-14T04:27:55.938Z  INFO 17415 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-14T04:27:56.083Z  INFO 17415 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-14T04:27:56.083Z  INFO 17415 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2828 ms
2026-06-14T04:27:56.230Z  INFO 17415 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-14T04:27:56.463Z  INFO 17415 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loading instruments from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T04:27:58.393Z  INFO 17415 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loaded 17996 instruments (ISINs: 17996, Keys: 139030) from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T04:27:58.393Z  INFO 17415 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Identified 211 F&O linked equities.
2026-06-14T04:27:59.225Z  INFO 17415 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-14T04:27:59.238Z  INFO 17415 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 7.169 seconds (process running for 8.058)
2026-06-14T04:33:06.255Z  INFO 18421 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication using Java 21.0.10 with PID 18421 (/root/fundamentals/backend/target/classes started by root in /root/fundamentals/backend)
2026-06-14T04:33:06.259Z  INFO 18421 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-14T04:33:08.294Z  INFO 18421 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-14T04:33:08.312Z  INFO 18421 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-14T04:33:08.312Z  INFO 18421 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-14T04:33:08.449Z  INFO 18421 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-14T04:33:08.449Z  INFO 18421 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2110 ms
2026-06-14T04:33:08.596Z  INFO 18421 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-14T04:33:08.745Z  INFO 18421 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loading instruments from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T04:33:10.563Z  INFO 18421 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loaded 17996 instruments (ISINs: 17996, Keys: 139030) from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T04:33:10.564Z  INFO 18421 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Identified 211 F&O linked equities.
2026-06-14T04:33:11.412Z  INFO 18421 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-14T04:33:11.425Z  INFO 18421 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 6.245 seconds (process running for 6.914)
2026-06-14T04:38:10.886Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-14T04:38:10.892Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-14T04:38:10.902Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 7 ms
2026-06-14T04:38:12.179Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-7] c.v.f.controller.FundamentalController   : Request received for ISIN: INE522D01027
2026-06-14T04:38:12.178Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.controller.FundamentalController   : Request received for ISIN: INE171Z01026
2026-06-14T04:38:12.181Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.controller.FundamentalController   : Request received for ISIN: INE749A01030
2026-06-14T04:38:12.178Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-9] c.v.f.controller.FundamentalController   : Request received for ISIN: INE585B01010
2026-06-14T04:38:12.182Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.controller.FundamentalController   : Request received for ISIN: INE00R701025
2026-06-14T04:38:12.183Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-9] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE585B01010...
2026-06-14T04:38:12.184Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE00R701025...
2026-06-14T04:38:12.187Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-9] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE585B01010
2026-06-14T04:38:12.190Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.controller.FundamentalController   : Request received for ISIN: INE917I01010
2026-06-14T04:38:12.183Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE749A01030...
2026-06-14T04:38:12.187Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE00R701025
2026-06-14T04:38:12.180Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-8] c.v.f.controller.FundamentalController   : Request received for ISIN: INE139A01034
2026-06-14T04:38:12.185Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.controller.FundamentalController   : Request received for ISIN: INE267A01025
2026-06-14T04:38:12.182Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE171Z01026...
2026-06-14T04:38:12.193Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE749A01030
2026-06-14T04:38:12.193Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-8] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE139A01034...
2026-06-14T04:38:12.182Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-7] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE522D01027...
2026-06-14T04:38:12.196Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE171Z01026
2026-06-14T04:38:12.197Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-7] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE522D01027
2026-06-14T04:38:12.193Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE267A01025...
2026-06-14T04:38:12.189Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.controller.FundamentalController   : Request received for ISIN: INE466L01038
2026-06-14T04:38:12.199Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE466L01038...
2026-06-14T04:38:12.197Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-8] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE139A01034
2026-06-14T04:38:12.200Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE267A01025
2026-06-14T04:38:12.206Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE466L01038
2026-06-14T04:38:12.192Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE070A01015
2026-06-14T04:38:12.373Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE070A01015...
2026-06-14T04:38:12.382Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE070A01015
2026-06-14T04:38:12.192Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE917I01010...
2026-06-14T04:38:12.390Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE917I01010
2026-06-14T04:38:17.244Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE00R701025: null
2026-06-14T04:38:17.250Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE466L01038: null
2026-06-14T04:38:17.251Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE139A01034: null
2026-06-14T04:38:17.251Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE267A01025: null
2026-06-14T04:38:17.252Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE522D01027: null
2026-06-14T04:38:17.252Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE171Z01026: null
2026-06-14T04:38:17.252Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE749A01030: null
2026-06-14T04:38:17.253Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE585B01010: null
2026-06-14T04:38:17.276Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE585B01010: null
2026-06-14T04:38:17.282Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE522D01027: null
2026-06-14T04:38:17.285Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE00R701025: null
2026-06-14T04:38:17.288Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE139A01034: null
2026-06-14T04:38:17.290Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE749A01030: null
2026-06-14T04:38:17.292Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE267A01025: null
2026-06-14T04:38:17.294Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE466L01038: null
2026-06-14T04:38:17.295Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE171Z01026: null
2026-06-14T04:38:17.296Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE522D01027: null
2026-06-14T04:38:17.306Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE171Z01026: null
2026-06-14T04:38:17.307Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE585B01010: null
2026-06-14T04:38:17.307Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE466L01038: null
2026-06-14T04:38:17.307Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE267A01025: null
2026-06-14T04:38:17.308Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE749A01030: null
2026-06-14T04:38:17.308Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE139A01034: null
2026-06-14T04:38:17.309Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE00R701025: null
2026-06-14T04:38:17.317Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE522D01027: null
2026-06-14T04:38:17.324Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE00R701025: null
2026-06-14T04:38:17.325Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE139A01034: null
2026-06-14T04:38:17.326Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE749A01030: null
2026-06-14T04:38:17.329Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE267A01025: null
2026-06-14T04:38:17.330Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE585B01010: null
2026-06-14T04:38:17.332Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE171Z01026: null
2026-06-14T04:38:17.332Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE466L01038: null
2026-06-14T04:38:17.334Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE00R701025: null
2026-06-14T04:38:17.335Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE522D01027: null
2026-06-14T04:38:17.339Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE466L01038: null
2026-06-14T04:38:17.340Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE171Z01026: null
2026-06-14T04:38:17.340Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE585B01010: null
2026-06-14T04:38:17.342Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE267A01025: null
2026-06-14T04:38:17.342Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE749A01030: null
2026-06-14T04:38:17.343Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE139A01034: null
2026-06-14T04:38:17.350Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE00R701025: null
2026-06-14T04:38:17.351Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE171Z01026: null
2026-06-14T04:38:17.352Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE466L01038: null
2026-06-14T04:38:17.353Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE139A01034: null
2026-06-14T04:38:17.355Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE749A01030: null
2026-06-14T04:38:17.356Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE522D01027: null
2026-06-14T04:38:17.356Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE267A01025: null
2026-06-14T04:38:17.357Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE585B01010: null
2026-06-14T04:38:17.358Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE00R701025: null
2026-06-14T04:38:17.362Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE585B01010: null
2026-06-14T04:38:17.363Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE267A01025: null
2026-06-14T04:38:17.364Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE171Z01026: null
2026-06-14T04:38:17.364Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE522D01027: null
2026-06-14T04:38:17.365Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE749A01030: null
2026-06-14T04:38:17.365Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE139A01034: null
2026-06-14T04:38:17.365Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE466L01038: null
2026-06-14T04:38:17.366Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE00R701025: null
2026-06-14T04:38:17.366Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE466L01038: null
2026-06-14T04:38:17.369Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE139A01034: null
2026-06-14T04:38:17.373Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE585B01010: null
2026-06-14T04:38:17.374Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE522D01027: null
2026-06-14T04:38:17.374Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE749A01030: null
2026-06-14T04:38:17.375Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE171Z01026: null
2026-06-14T04:38:17.375Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE267A01025: null
2026-06-14T04:38:17.387Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE070A01015: null
2026-06-14T04:38:17.389Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE070A01015: null
2026-06-14T04:38:17.390Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE070A01015: null
2026-06-14T04:38:17.390Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE070A01015: null
2026-06-14T04:38:17.390Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE070A01015: null
2026-06-14T04:38:17.390Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE070A01015: null
2026-06-14T04:38:17.391Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE070A01015: null
2026-06-14T04:38:17.391Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE070A01015: null
2026-06-14T04:38:17.392Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE917I01010: null
2026-06-14T04:38:17.404Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE917I01010: null
2026-06-14T04:38:17.405Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE917I01010: null
2026-06-14T04:38:17.406Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE917I01010: null
2026-06-14T04:38:17.406Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE917I01010: null
2026-06-14T04:38:17.406Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE917I01010: null
2026-06-14T04:38:17.407Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE917I01010: null
2026-06-14T04:38:17.407Z ERROR 18421 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE917I01010: null
2026-06-14T04:38:17.614Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE139A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.616Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE171Z01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.620Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE522D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.620Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE522D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.620Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE070A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.621Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE139A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.621Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE749A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.623Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE917I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.623Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE749A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.623Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE917I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.624Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE522D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.624Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE267A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.624Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE466L01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.630Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE171Z01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.631Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE466L01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.631Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE749A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.631Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE171Z01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.631Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE917I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.631Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE00R701025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.631Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE522D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.632Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE171Z01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.632Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE466L01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.631Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE585B01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.632Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE171Z01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:17.642Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE917I01010. Rebuilding from history...
2026-06-14T04:38:17.642Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE00R701025. Rebuilding from history...
2026-06-14T04:38:17.644Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-7] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE522D01027. Rebuilding from history...
2026-06-14T04:38:17.645Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-9] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE585B01010. Rebuilding from history...
2026-06-14T04:38:17.660Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE749A01030. Rebuilding from history...
2026-06-14T04:38:17.664Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE466L01038. Rebuilding from history...
2026-06-14T04:38:17.667Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE070A01015. Rebuilding from history...
2026-06-14T04:38:17.675Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE267A01025. Rebuilding from history...
2026-06-14T04:38:17.678Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-8] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE139A01034. Rebuilding from history...
2026-06-14T04:38:17.681Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE171Z01026. Rebuilding from history...
2026-06-14T04:38:19.559Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.controller.FundamentalController   : Request received for ISIN: INE591G01025
2026-06-14T04:38:19.562Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE591G01025...
2026-06-14T04:38:19.567Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE591G01025
2026-06-14T04:38:19.654Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.controller.FundamentalController   : Request received for ISIN: INE736A01011
2026-06-14T04:38:19.660Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE736A01011...
2026-06-14T04:38:19.664Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE736A01011
2026-06-14T04:38:19.737Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.controller.FundamentalController   : Request received for ISIN: INE009A01021
2026-06-14T04:38:19.741Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE009A01021...
2026-06-14T04:38:19.745Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE009A01021
2026-06-14T04:38:19.794Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.controller.FundamentalController   : Request received for ISIN: INE160A01022
2026-06-14T04:38:19.796Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE160A01022...
2026-06-14T04:38:19.801Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE160A01022
2026-06-14T04:38:19.850Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.controller.FundamentalController   : Request received for ISIN: INE134E01011
2026-06-14T04:38:19.852Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE134E01011...
2026-06-14T04:38:19.859Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE134E01011
2026-06-14T04:38:19.876Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.controller.FundamentalController   : Request received for ISIN: INE102D01028
2026-06-14T04:38:19.883Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE102D01028...
2026-06-14T04:38:19.892Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE102D01028
2026-06-14T04:38:19.910Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-26] c.v.f.controller.FundamentalController   : Request received for ISIN: INE376G01013
2026-06-14T04:38:19.911Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-26] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE376G01013...
2026-06-14T04:38:19.914Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-26] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE376G01013
2026-06-14T04:38:19.916Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-27] c.v.f.controller.FundamentalController   : Request received for ISIN: INE814H01029
2026-06-14T04:38:19.920Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-27] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE814H01029...
2026-06-14T04:38:19.927Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-27] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE814H01029
2026-06-14T04:38:20.001Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-29] c.v.f.controller.FundamentalController   : Request received for ISIN: INE918Z01012
2026-06-14T04:38:20.001Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.controller.FundamentalController   : Request received for ISIN: INE619A01035
2026-06-14T04:38:20.008Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-29] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE918Z01012...
2026-06-14T04:38:20.009Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE619A01035...
2026-06-14T04:38:20.010Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-29] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE918Z01012
2026-06-14T04:38:20.017Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE619A01035
2026-06-14T04:38:20.043Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE736A01011. Rebuilding from history...
2026-06-14T04:38:20.050Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE591G01025. Rebuilding from history...
2026-06-14T04:38:20.097Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE009A01021. Rebuilding from history...
2026-06-14T04:38:20.185Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE736A01011 (offset: 0)
2026-06-14T04:38:20.185Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE009A01021 (offset: 0)
2026-06-14T04:38:20.185Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE591G01025 (offset: 0)
2026-06-14T04:38:20.185Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE160A01022. Rebuilding from history...
2026-06-14T04:38:20.208Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE736A01011 (offset: 0)
2026-06-14T04:38:20.222Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE009A01021 (offset: 0)
2026-06-14T04:38:20.222Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE134E01011. Rebuilding from history...
2026-06-14T04:38:20.235Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE591G01025 (offset: 0)
2026-06-14T04:38:20.253Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE736A01011 (offset: 0)
2026-06-14T04:38:20.261Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE009A01021 (offset: 0)
2026-06-14T04:38:20.263Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE376G01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.271Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE376G01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.271Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE591G01025 (offset: 0)
2026-06-14T04:38:20.282Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE376G01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.281Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE376G01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.293Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE376G01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.294Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE814H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.294Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE814H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.294Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE736A01011 (offset: 0)
2026-06-14T04:38:20.295Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE814H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.294Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE814H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.295Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE814H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.283Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE376G01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.309Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE814H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.315Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE814H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.316Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-26] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE376G01013. Rebuilding from history...
2026-06-14T04:38:20.318Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE591G01025 (offset: 0)
2026-06-14T04:38:20.318Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE134E01011 (offset: 0)
2026-06-14T04:38:20.318Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE102D01028. Rebuilding from history...
2026-06-14T04:38:20.319Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE918Z01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.324Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE918Z01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.318Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE814H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.327Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE918Z01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.337Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-27] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE814H01029. Rebuilding from history...
2026-06-14T04:38:20.347Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE134E01011 (offset: 0)
2026-06-14T04:38:20.358Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE134E01011 (offset: 0)
2026-06-14T04:38:20.374Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE134E01011 (offset: 0)
2026-06-14T04:38:20.379Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-26] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE376G01013 (offset: 0)
2026-06-14T04:38:20.379Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE009A01021 (offset: 0)
2026-06-14T04:38:20.394Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE591G01025 (offset: 0)
2026-06-14T04:38:20.387Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE134E01011 (offset: 0)
2026-06-14T04:38:20.397Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE736A01011 (offset: 0)
2026-06-14T04:38:20.399Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE918Z01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.410Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE160A01022 (offset: 0)
2026-06-14T04:38:20.398Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE918Z01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.404Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE918Z01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.404Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-26] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE376G01013 (offset: 0)
2026-06-14T04:38:20.405Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE918Z01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.405Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE918Z01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:20.421Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE134E01011 (offset: 0)
2026-06-14T04:38:20.424Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE591G01025 (offset: 0)
2026-06-14T04:38:20.434Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-29] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE918Z01012. Rebuilding from history...
2026-06-14T04:38:20.437Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE102D01028 (offset: 0)
2026-06-14T04:38:20.442Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE160A01022 (offset: 0)
2026-06-14T04:38:20.442Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.controller.FundamentalController   : Request received for ISIN: INE465A01025
2026-06-14T04:38:20.443Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE465A01025...
2026-06-14T04:38:20.444Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE465A01025
2026-06-14T04:38:20.446Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE009A01021 (offset: 0)
2026-06-14T04:38:20.465Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE591G01025 (offset: 0)
2026-06-14T04:38:20.471Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE160A01022 (offset: 0)
2026-06-14T04:38:20.472Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE009A01021 (offset: 0)
2026-06-14T04:38:20.477Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-20] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE591G01025 (offset: 0)
2026-06-14T04:38:20.482Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE009A01021 (offset: 0)
2026-06-14T04:38:20.485Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE102D01028 (offset: 0)
2026-06-14T04:38:20.486Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE619A01035. Rebuilding from history...
2026-06-14T04:38:20.489Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE134E01011 (offset: 0)
2026-06-14T04:38:20.497Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-22] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE009A01021 (offset: 0)
2026-06-14T04:38:20.489Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE736A01011 (offset: 0)
2026-06-14T04:38:20.504Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE736A01011 (offset: 0)
2026-06-14T04:38:20.504Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE102D01028 (offset: 0)
2026-06-14T04:38:20.514Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-21] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE736A01011 (offset: 0)
2026-06-14T04:38:20.510Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE160A01022 (offset: 0)
2026-06-14T04:38:20.515Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-24] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE134E01011 (offset: 0)
2026-06-14T04:38:20.514Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE102D01028 (offset: 0)
2026-06-14T04:38:20.560Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE102D01028 (offset: 0)
2026-06-14T04:38:20.562Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE619A01035 (offset: 0)
2026-06-14T04:38:20.576Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.controller.FundamentalController   : Request received for ISIN: INE237A01036
2026-06-14T04:38:20.577Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE619A01035 (offset: 0)
2026-06-14T04:38:20.579Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE237A01036...
2026-06-14T04:38:20.578Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE102D01028 (offset: 0)
2026-06-14T04:38:20.582Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.controller.FundamentalController   : Request received for ISIN: INE361B01024
2026-06-14T04:38:20.581Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.controller.FundamentalController   : Request received for ISIN: INE540L01014
2026-06-14T04:38:20.597Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE361B01024...
2026-06-14T04:38:20.602Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE361B01024
2026-06-14T04:38:20.603Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE237A01036
2026-06-14T04:38:20.603Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE540L01014...
2026-06-14T04:38:20.608Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE102D01028 (offset: 0)
2026-06-14T04:38:20.608Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE540L01014
2026-06-14T04:38:20.603Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE619A01035 (offset: 0)
2026-06-14T04:38:20.604Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE160A01022 (offset: 0)
2026-06-14T04:38:20.615Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-25] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE102D01028 (offset: 0)
2026-06-14T04:38:20.615Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE160A01022 (offset: 0)
2026-06-14T04:38:20.615Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE619A01035 (offset: 0)
2026-06-14T04:38:20.631Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE619A01035 (offset: 0)
2026-06-14T04:38:20.636Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE619A01035 (offset: 0)
2026-06-14T04:38:20.639Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.controller.FundamentalController   : Request received for ISIN: INE811K01011
2026-06-14T04:38:20.639Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE811K01011...
2026-06-14T04:38:20.640Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE619A01035 (offset: 0)
2026-06-14T04:38:20.640Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE160A01022 (offset: 0)
2026-06-14T04:38:20.641Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE811K01011
2026-06-14T04:38:20.662Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-23] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE160A01022 (offset: 0)
2026-06-14T04:38:20.675Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-28] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE619A01035 (offset: 0)
2026-06-14T04:38:20.684Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-43] c.v.f.controller.FundamentalController   : Request received for ISIN: INE01EA01019
2026-06-14T04:38:20.689Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-43] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE01EA01019...
2026-06-14T04:38:20.690Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-43] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE01EA01019
2026-06-14T04:38:20.698Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-45] c.v.f.controller.FundamentalController   : Request received for ISIN: INE030A01027
2026-06-14T04:38:20.699Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-45] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE030A01027...
2026-06-14T04:38:20.707Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-45] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE030A01027
2026-06-14T04:38:20.721Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-47] c.v.f.controller.FundamentalController   : Request received for ISIN: INE476A01022
2026-06-14T04:38:20.722Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-47] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE476A01022...
2026-06-14T04:38:20.729Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-47] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE476A01022
2026-06-14T04:38:20.738Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-48] c.v.f.controller.FundamentalController   : Request received for ISIN: INE745G01043
2026-06-14T04:38:20.739Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-48] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE745G01043...
2026-06-14T04:38:20.741Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-48] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE745G01043
2026-06-14T04:38:20.746Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-49] c.v.f.controller.FundamentalController   : Request received for ISIN: INE721A01047
2026-06-14T04:38:20.749Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-49] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE721A01047...
2026-06-14T04:38:20.752Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-49] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE721A01047
2026-06-14T04:38:20.755Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE465A01025. Rebuilding from history...
2026-06-14T04:38:20.781Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE465A01025 (offset: 0)
2026-06-14T04:38:20.788Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE465A01025 (offset: 0)
2026-06-14T04:38:20.793Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE465A01025 (offset: 0)
2026-06-14T04:38:20.798Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE465A01025 (offset: 0)
2026-06-14T04:38:20.804Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE465A01025 (offset: 0)
2026-06-14T04:38:20.810Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE465A01025 (offset: 0)
2026-06-14T04:38:20.814Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE465A01025 (offset: 0)
2026-06-14T04:38:20.827Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-31] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE465A01025 (offset: 0)
2026-06-14T04:38:20.871Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-51] c.v.f.controller.FundamentalController   : Request received for ISIN: INE028A01039
2026-06-14T04:38:20.872Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-51] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE028A01039...
2026-06-14T04:38:20.875Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-51] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE028A01039
2026-06-14T04:38:20.958Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE237A01036. Rebuilding from history...
2026-06-14T04:38:20.964Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE361B01024. Rebuilding from history...
2026-06-14T04:38:20.998Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE237A01036 (offset: 0)
2026-06-14T04:38:21.001Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE361B01024 (offset: 0)
2026-06-14T04:38:21.011Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE237A01036 (offset: 0)
2026-06-14T04:38:21.020Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE01EA01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.027Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE361B01024 (offset: 0)
2026-06-14T04:38:21.026Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE237A01036 (offset: 0)
2026-06-14T04:38:21.030Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE01EA01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.041Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE237A01036 (offset: 0)
2026-06-14T04:38:21.032Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE01EA01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.041Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE361B01024 (offset: 0)
2026-06-14T04:38:21.039Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE01EA01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.037Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE01EA01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.054Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE01EA01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.057Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE030A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.057Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE030A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.072Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-43] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE01EA01019. Rebuilding from history...
2026-06-14T04:38:21.057Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE030A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.061Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE030A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.073Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE237A01036 (offset: 0)
2026-06-14T04:38:21.078Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE030A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.079Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE030A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.079Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE030A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.090Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE811K01011. Rebuilding from history...
2026-06-14T04:38:21.079Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE030A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.091Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE476A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.093Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-43] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE01EA01019 (offset: 0)
2026-06-14T04:38:21.093Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE476A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.093Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE237A01036 (offset: 0)
2026-06-14T04:38:21.094Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE476A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.093Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE476A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.096Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE476A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.096Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE540L01014. Rebuilding from history...
2026-06-14T04:38:21.096Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE476A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.098Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE476A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.110Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE476A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.104Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-43] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE01EA01019 (offset: 0)
2026-06-14T04:38:21.103Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE237A01036 (offset: 0)
2026-06-14T04:38:21.110Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-45] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE030A01027. Rebuilding from history...
2026-06-14T04:38:21.112Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE745G01043. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.122Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE745G01043. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.125Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE745G01043. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.128Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE745G01043. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.132Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-47] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE476A01022. Rebuilding from history...
2026-06-14T04:38:21.136Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE361B01024 (offset: 0)
2026-06-14T04:38:21.140Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE745G01043. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.155Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-37] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE237A01036 (offset: 0)
2026-06-14T04:38:21.159Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE811K01011 (offset: 0)
2026-06-14T04:38:21.159Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE540L01014 (offset: 0)
2026-06-14T04:38:21.160Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE361B01024 (offset: 0)
2026-06-14T04:38:21.172Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE745G01043. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.172Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE361B01024 (offset: 0)
2026-06-14T04:38:21.177Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE745G01043. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.185Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE721A01047. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.186Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE745G01043. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.184Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE721A01047. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.186Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE721A01047. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.184Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE540L01014 (offset: 0)
2026-06-14T04:38:21.188Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE361B01024 (offset: 0)
2026-06-14T04:38:21.189Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE721A01047. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.190Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE721A01047. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.192Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE721A01047. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.192Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE721A01047. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.194Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE028A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.195Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE028A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.194Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE721A01047. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.189Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE811K01011 (offset: 0)
2026-06-14T04:38:21.203Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE028A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.195Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE028A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.196Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE028A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.197Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-48] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE745G01043. Rebuilding from history...
2026-06-14T04:38:21.199Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-38] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE361B01024 (offset: 0)
2026-06-14T04:38:21.200Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE540L01014 (offset: 0)
2026-06-14T04:38:21.201Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.controller.FundamentalController   : Request received for ISIN: INE670K01029
2026-06-14T04:38:21.201Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE028A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.202Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE028A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.228Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE670K01029...
2026-06-14T04:38:21.203Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE028A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.204Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-49] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE721A01047. Rebuilding from history...
2026-06-14T04:38:21.233Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE670K01029
2026-06-14T04:38:21.248Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE540L01014 (offset: 0)
2026-06-14T04:38:21.252Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE811K01011 (offset: 0)
2026-06-14T04:38:21.258Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-51] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE028A01039. Rebuilding from history...
2026-06-14T04:38:21.261Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.controller.FundamentalController   : Request received for ISIN: INE158A01026
2026-06-14T04:38:21.267Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE540L01014 (offset: 0)
2026-06-14T04:38:21.269Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE811K01011 (offset: 0)
2026-06-14T04:38:21.269Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE158A01026...
2026-06-14T04:38:21.273Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.controller.FundamentalController   : Request received for ISIN: INE405E01023
2026-06-14T04:38:21.284Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE811K01011 (offset: 0)
2026-06-14T04:38:21.282Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE405E01023...
2026-06-14T04:38:21.285Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE405E01023
2026-06-14T04:38:21.286Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE811K01011 (offset: 0)
2026-06-14T04:38:21.282Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE158A01026
2026-06-14T04:38:21.288Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE811K01011 (offset: 0)
2026-06-14T04:38:21.292Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE540L01014 (offset: 0)
2026-06-14T04:38:21.294Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-41] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE811K01011 (offset: 0)
2026-06-14T04:38:21.307Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE540L01014 (offset: 0)
2026-06-14T04:38:21.309Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.controller.FundamentalController   : Request received for ISIN: INE123W01016
2026-06-14T04:38:21.311Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE123W01016...
2026-06-14T04:38:21.320Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE123W01016
2026-06-14T04:38:21.322Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-36] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE540L01014 (offset: 0)
2026-06-14T04:38:21.327Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.controller.FundamentalController   : Request received for ISIN: INE192A01025
2026-06-14T04:38:21.328Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE192A01025...
2026-06-14T04:38:21.329Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE192A01025
2026-06-14T04:38:21.339Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.controller.FundamentalController   : Request received for ISIN: INE118A01012
2026-06-14T04:38:21.339Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE118A01012...
2026-06-14T04:38:21.340Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE118A01012
2026-06-14T04:38:21.343Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-65] c.v.f.controller.FundamentalController   : Request received for ISIN: INE674K01013
2026-06-14T04:38:21.344Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-65] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE674K01013...
2026-06-14T04:38:21.345Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-65] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE674K01013
2026-06-14T04:38:21.374Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-68] c.v.f.controller.FundamentalController   : Request received for ISIN: INE094A01015
2026-06-14T04:38:21.374Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-68] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE094A01015...
2026-06-14T04:38:21.375Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-70] c.v.f.controller.FundamentalController   : Request received for ISIN: INE528G01035
2026-06-14T04:38:21.375Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-68] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE094A01015
2026-06-14T04:38:21.376Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-70] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE528G01035...
2026-06-14T04:38:21.379Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-70] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE528G01035
2026-06-14T04:38:21.393Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-71] c.v.f.controller.FundamentalController   : Request received for ISIN: INE531F01023
2026-06-14T04:38:21.395Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-71] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE531F01023...
2026-06-14T04:38:21.401Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-71] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE531F01023
2026-06-14T04:38:21.512Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE670K01029. Rebuilding from history...
2026-06-14T04:38:21.539Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE670K01029 (offset: 0)
2026-06-14T04:38:21.553Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE670K01029 (offset: 0)
2026-06-14T04:38:21.562Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE670K01029 (offset: 0)
2026-06-14T04:38:21.572Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE670K01029 (offset: 0)
2026-06-14T04:38:21.583Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE670K01029 (offset: 0)
2026-06-14T04:38:21.589Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE670K01029 (offset: 0)
2026-06-14T04:38:21.594Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE670K01029 (offset: 0)
2026-06-14T04:38:21.617Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-54] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE670K01029 (offset: 0)
2026-06-14T04:38:21.637Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE405E01023. Rebuilding from history...
2026-06-14T04:38:21.688Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE405E01023 (offset: 0)
2026-06-14T04:38:21.705Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE405E01023 (offset: 0)
2026-06-14T04:38:21.714Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE158A01026. Rebuilding from history...
2026-06-14T04:38:21.716Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE405E01023 (offset: 0)
2026-06-14T04:38:21.721Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-73] c.v.f.controller.FundamentalController   : Request received for ISIN: INE093I01010
2026-06-14T04:38:21.724Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-73] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE093I01010...
2026-06-14T04:38:21.737Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-73] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE093I01010
2026-06-14T04:38:21.754Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE158A01026 (offset: 0)
2026-06-14T04:38:21.753Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE405E01023 (offset: 0)
2026-06-14T04:38:21.776Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE158A01026 (offset: 0)
2026-06-14T04:38:21.778Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE405E01023 (offset: 0)
2026-06-14T04:38:21.788Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE158A01026 (offset: 0)
2026-06-14T04:38:21.801Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE405E01023 (offset: 0)
2026-06-14T04:38:21.812Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE158A01026 (offset: 0)
2026-06-14T04:38:21.818Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE405E01023 (offset: 0)
2026-06-14T04:38:21.827Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE674K01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.827Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE158A01026 (offset: 0)
2026-06-14T04:38:21.828Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE674K01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE674K01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.834Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE674K01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.836Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE094A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.841Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE158A01026 (offset: 0)
2026-06-14T04:38:21.847Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE674K01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.849Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE528G01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.852Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE674K01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.853Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-59] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE405E01023 (offset: 0)
2026-06-14T04:38:21.853Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE528G01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.858Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE094A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.871Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-65] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE674K01013. Rebuilding from history...
2026-06-14T04:38:21.858Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE158A01026 (offset: 0)
2026-06-14T04:38:21.860Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE528G01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.896Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE123W01016. Rebuilding from history...
2026-06-14T04:38:21.865Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE094A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.868Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE528G01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.920Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE528G01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.929Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE118A01012. Rebuilding from history...
2026-06-14T04:38:21.929Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE094A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.930Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE531F01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.922Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE528G01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.932Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE094A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.931Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE123W01016 (offset: 0)
2026-06-14T04:38:21.936Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE528G01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.952Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE094A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.953Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE123W01016 (offset: 0)
2026-06-14T04:38:21.962Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE094A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:21.949Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE192A01025. Rebuilding from history...
2026-06-14T04:38:21.969Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE123W01016 (offset: 0)
2026-06-14T04:38:21.978Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE123W01016 (offset: 0)
2026-06-14T04:38:21.992Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE118A01012 (offset: 0)
2026-06-14T04:38:21.998Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE531F01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.006Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE094A01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.005Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE123W01016 (offset: 0)
2026-06-14T04:38:22.015Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE528G01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.010Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE531F01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.017Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE093I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.018Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE093I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.018Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE531F01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.021Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE531F01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.026Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE093I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.031Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-70] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE528G01035. Rebuilding from history...
2026-06-14T04:38:22.033Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE118A01012 (offset: 0)
2026-06-14T04:38:22.034Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE531F01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.041Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE123W01016 (offset: 0)
2026-06-14T04:38:22.062Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-68] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE094A01015. Rebuilding from history...
2026-06-14T04:38:22.068Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE123W01016 (offset: 0)
2026-06-14T04:38:22.069Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE118A01012 (offset: 0)
2026-06-14T04:38:22.072Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE531F01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.075Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE192A01025 (offset: 0)
2026-06-14T04:38:22.078Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE093I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.080Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE093I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.087Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE118A01012 (offset: 0)
2026-06-14T04:38:22.098Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-61] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE123W01016 (offset: 0)
2026-06-14T04:38:22.103Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE531F01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.114Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE093I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.115Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE093I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.118Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE093I01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:22.118Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-71] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE531F01023. Rebuilding from history...
2026-06-14T04:38:22.121Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-73] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE093I01010. Rebuilding from history...
2026-06-14T04:38:22.121Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE118A01012 (offset: 0)
2026-06-14T04:38:22.123Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-65] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE674K01013 (offset: 0)
2026-06-14T04:38:22.150Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE192A01025 (offset: 0)
2026-06-14T04:38:22.155Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE118A01012 (offset: 0)
2026-06-14T04:38:22.162Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-65] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE674K01013 (offset: 0)
2026-06-14T04:38:22.176Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE118A01012 (offset: 0)
2026-06-14T04:38:22.177Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-56] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE158A01026 (offset: 0)
2026-06-14T04:38:22.180Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE192A01025 (offset: 0)
2026-06-14T04:38:22.189Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-64] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE118A01012 (offset: 0)
2026-06-14T04:38:22.202Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE192A01025 (offset: 0)
2026-06-14T04:38:22.214Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE192A01025 (offset: 0)
2026-06-14T04:38:22.218Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE192A01025 (offset: 0)
2026-06-14T04:38:22.222Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE192A01025 (offset: 0)
2026-06-14T04:38:22.227Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-63] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE192A01025 (offset: 0)
2026-06-14T04:38:22.276Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.controller.FundamentalController   : Request received for ISIN: INE726G01019
2026-06-14T04:38:22.277Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE726G01019...
2026-06-14T04:38:22.280Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE726G01019
2026-06-14T04:38:22.540Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE726G01019. Rebuilding from history...
2026-06-14T04:38:22.553Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.controller.FundamentalController   : Request received for ISIN: INE006I01046
2026-06-14T04:38:22.558Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE006I01046...
2026-06-14T04:38:22.560Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE006I01046
2026-06-14T04:38:22.571Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE726G01019 (offset: 0)
2026-06-14T04:38:22.580Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE726G01019 (offset: 0)
2026-06-14T04:38:22.589Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE726G01019 (offset: 0)
2026-06-14T04:38:22.600Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE726G01019 (offset: 0)
2026-06-14T04:38:22.624Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE726G01019 (offset: 0)
2026-06-14T04:38:22.639Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE726G01019 (offset: 0)
2026-06-14T04:38:22.646Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE726G01019 (offset: 0)
2026-06-14T04:38:22.660Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-77] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE726G01019 (offset: 0)
2026-06-14T04:38:22.852Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.controller.FundamentalController   : Request received for ISIN: INE073K01018
2026-06-14T04:38:22.855Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE073K01018...
2026-06-14T04:38:22.858Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE073K01018
2026-06-14T04:38:22.935Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE006I01046. Rebuilding from history...
2026-06-14T04:38:22.972Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE006I01046 (offset: 0)
2026-06-14T04:38:22.989Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE006I01046 (offset: 0)
2026-06-14T04:38:23.004Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE006I01046 (offset: 0)
2026-06-14T04:38:23.013Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE006I01046 (offset: 0)
2026-06-14T04:38:23.021Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE006I01046 (offset: 0)
2026-06-14T04:38:23.029Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE006I01046 (offset: 0)
2026-06-14T04:38:23.034Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE006I01046 (offset: 0)
2026-06-14T04:38:23.042Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-78] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE006I01046 (offset: 0)
2026-06-14T04:38:23.119Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE073K01018. Rebuilding from history...
2026-06-14T04:38:23.157Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE073K01018 (offset: 0)
2026-06-14T04:38:23.166Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE073K01018 (offset: 0)
2026-06-14T04:38:23.175Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE073K01018 (offset: 0)
2026-06-14T04:38:23.179Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.controller.FundamentalController   : Request received for ISIN: INE849A01020
2026-06-14T04:38:23.181Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE849A01020...
2026-06-14T04:38:23.184Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE849A01020
2026-06-14T04:38:23.184Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE073K01018 (offset: 0)
2026-06-14T04:38:23.197Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE073K01018 (offset: 0)
2026-06-14T04:38:23.208Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE073K01018 (offset: 0)
2026-06-14T04:38:23.215Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE073K01018 (offset: 0)
2026-06-14T04:38:23.221Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-80] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE073K01018 (offset: 0)
2026-06-14T04:38:23.477Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE849A01020. Rebuilding from history...
2026-06-14T04:38:23.523Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE849A01020 (offset: 0)
2026-06-14T04:38:23.533Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE849A01020 (offset: 0)
2026-06-14T04:38:23.542Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE849A01020 (offset: 0)
2026-06-14T04:38:23.551Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE849A01020 (offset: 0)
2026-06-14T04:38:23.559Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE849A01020 (offset: 0)
2026-06-14T04:38:23.567Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE849A01020 (offset: 0)
2026-06-14T04:38:23.577Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE849A01020 (offset: 0)
2026-06-14T04:38:23.590Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-81] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE849A01020 (offset: 0)
2026-06-14T04:38:23.945Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.controller.FundamentalController   : Request received for ISIN: INE216A01030
2026-06-14T04:38:23.946Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE216A01030...
2026-06-14T04:38:23.954Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE216A01030
2026-06-14T04:38:24.096Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.controller.FundamentalController   : Request received for ISIN: INE062A01020
2026-06-14T04:38:24.099Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE062A01020...
2026-06-14T04:38:24.105Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE062A01020
2026-06-14T04:38:24.321Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.controller.FundamentalController   : Request received for ISIN: INE075A01022
2026-06-14T04:38:24.322Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE075A01022...
2026-06-14T04:38:24.324Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE075A01022
2026-06-14T04:38:24.369Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE216A01030. Rebuilding from history...
2026-06-14T04:38:24.401Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE216A01030 (offset: 0)
2026-06-14T04:38:24.421Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE216A01030 (offset: 0)
2026-06-14T04:38:24.431Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE216A01030 (offset: 0)
2026-06-14T04:38:24.436Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE216A01030 (offset: 0)
2026-06-14T04:38:24.440Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE216A01030 (offset: 0)
2026-06-14T04:38:24.446Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE062A01020. Rebuilding from history...
2026-06-14T04:38:24.448Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE216A01030 (offset: 0)
2026-06-14T04:38:24.455Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE216A01030 (offset: 0)
2026-06-14T04:38:24.462Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-88] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE216A01030 (offset: 0)
2026-06-14T04:38:24.469Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE062A01020 (offset: 0)
2026-06-14T04:38:24.473Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.controller.FundamentalController   : Request received for ISIN: INE669C01036
2026-06-14T04:38:24.473Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE669C01036...
2026-06-14T04:38:24.474Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE669C01036
2026-06-14T04:38:24.490Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE062A01020 (offset: 0)
2026-06-14T04:38:24.504Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE062A01020 (offset: 0)
2026-06-14T04:38:24.516Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE062A01020 (offset: 0)
2026-06-14T04:38:24.523Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE062A01020 (offset: 0)
2026-06-14T04:38:24.524Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.controller.FundamentalController   : Request received for ISIN: INE111A01025
2026-06-14T04:38:24.525Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE111A01025...
2026-06-14T04:38:24.528Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE111A01025
2026-06-14T04:38:24.529Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE062A01020 (offset: 0)
2026-06-14T04:38:24.541Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE062A01020 (offset: 0)
2026-06-14T04:38:24.562Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE075A01022. Rebuilding from history...
2026-06-14T04:38:24.563Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-89] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE062A01020 (offset: 0)
2026-06-14T04:38:24.590Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE075A01022 (offset: 0)
2026-06-14T04:38:24.598Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE075A01022 (offset: 0)
2026-06-14T04:38:24.603Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE075A01022 (offset: 0)
2026-06-14T04:38:24.608Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE075A01022 (offset: 0)
2026-06-14T04:38:24.619Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE075A01022 (offset: 0)
2026-06-14T04:38:24.622Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.controller.FundamentalController   : Request received for ISIN: INE081A01020
2026-06-14T04:38:24.624Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE081A01020...
2026-06-14T04:38:24.625Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE075A01022 (offset: 0)
2026-06-14T04:38:24.628Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE081A01020
2026-06-14T04:38:24.635Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE075A01022 (offset: 0)
2026-06-14T04:38:24.655Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-91] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE075A01022 (offset: 0)
2026-06-14T04:38:24.782Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE669C01036. Rebuilding from history...
2026-06-14T04:38:24.802Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.controller.FundamentalController   : Request received for ISIN: INE498L01015
2026-06-14T04:38:24.805Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE498L01015...
2026-06-14T04:38:24.808Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE498L01015
2026-06-14T04:38:24.808Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE669C01036 (offset: 0)
2026-06-14T04:38:24.819Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE669C01036 (offset: 0)
2026-06-14T04:38:24.832Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE669C01036 (offset: 0)
2026-06-14T04:38:24.848Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE669C01036 (offset: 0)
2026-06-14T04:38:24.860Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE669C01036 (offset: 0)
2026-06-14T04:38:24.873Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE669C01036 (offset: 0)
2026-06-14T04:38:24.881Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE669C01036 (offset: 0)
2026-06-14T04:38:24.890Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-92] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE669C01036 (offset: 0)
2026-06-14T04:38:24.898Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE111A01025. Rebuilding from history...
2026-06-14T04:38:24.918Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE081A01020. Rebuilding from history...
2026-06-14T04:38:24.932Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE111A01025 (offset: 0)
2026-06-14T04:38:24.960Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE111A01025 (offset: 0)
2026-06-14T04:38:24.967Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE081A01020 (offset: 0)
2026-06-14T04:38:24.982Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE111A01025 (offset: 0)
2026-06-14T04:38:24.986Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE081A01020 (offset: 0)
2026-06-14T04:38:25.000Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE111A01025 (offset: 0)
2026-06-14T04:38:25.004Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE081A01020 (offset: 0)
2026-06-14T04:38:25.017Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-99] c.v.f.controller.FundamentalController   : Request received for ISIN: INE377N01017
2026-06-14T04:38:25.019Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE111A01025 (offset: 0)
2026-06-14T04:38:25.020Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-99] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE377N01017...
2026-06-14T04:38:25.018Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.controller.FundamentalController   : Request received for ISIN: INE484J01027
2026-06-14T04:38:25.020Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE081A01020 (offset: 0)
2026-06-14T04:38:25.028Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE484J01027...
2026-06-14T04:38:25.035Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE484J01027
2026-06-14T04:38:25.041Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-99] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE377N01017
2026-06-14T04:38:25.047Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE111A01025 (offset: 0)
2026-06-14T04:38:25.047Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE081A01020 (offset: 0)
2026-06-14T04:38:25.073Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE081A01020 (offset: 0)
2026-06-14T04:38:25.075Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE111A01025 (offset: 0)
2026-06-14T04:38:25.080Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE081A01020 (offset: 0)
2026-06-14T04:38:25.086Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE498L01015. Rebuilding from history...
2026-06-14T04:38:25.099Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-95] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE081A01020 (offset: 0)
2026-06-14T04:38:25.110Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-94] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE111A01025 (offset: 0)
2026-06-14T04:38:25.116Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE498L01015 (offset: 0)
2026-06-14T04:38:25.124Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE498L01015 (offset: 0)
2026-06-14T04:38:25.129Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE498L01015 (offset: 0)
2026-06-14T04:38:25.138Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE498L01015 (offset: 0)
2026-06-14T04:38:25.143Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE498L01015 (offset: 0)
2026-06-14T04:38:25.147Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE498L01015 (offset: 0)
2026-06-14T04:38:25.150Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE498L01015 (offset: 0)
2026-06-14T04:38:25.155Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-97] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE498L01015 (offset: 0)
2026-06-14T04:38:25.224Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.controller.FundamentalController   : Request received for ISIN: INE205A01025
2026-06-14T04:38:25.225Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE205A01025...
2026-06-14T04:38:25.232Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE205A01025
2026-06-14T04:38:25.237Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE484J01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:25.237Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE377N01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:25.247Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE377N01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:25.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE377N01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:25.248Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE377N01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:25.252Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE377N01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:25.253Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE377N01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:25.262Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE484J01027. Rebuilding from history...
2026-06-14T04:38:25.277Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE484J01027 (offset: 0)
2026-06-14T04:38:25.282Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE484J01027 (offset: 0)
2026-06-14T04:38:25.286Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE484J01027 (offset: 0)
2026-06-14T04:38:25.289Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE484J01027 (offset: 0)
2026-06-14T04:38:25.296Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE484J01027 (offset: 0)
2026-06-14T04:38:25.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE484J01027 (offset: 0)
2026-06-14T04:38:25.309Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-100] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE484J01027 (offset: 0)
2026-06-14T04:38:25.338Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-99] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE377N01017. Rebuilding from history...
2026-06-14T04:38:25.371Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-99] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE377N01017 (offset: 0)
2026-06-14T04:38:25.403Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-99] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE377N01017 (offset: 0)
2026-06-14T04:38:25.427Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.controller.FundamentalController   : Request received for ISIN: INE027H01010
2026-06-14T04:38:25.428Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE027H01010...
2026-06-14T04:38:25.431Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE027H01010
2026-06-14T04:38:25.477Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE205A01025. Rebuilding from history...
2026-06-14T04:38:25.499Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE205A01025 (offset: 0)
2026-06-14T04:38:25.509Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE205A01025 (offset: 0)
2026-06-14T04:38:25.518Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE205A01025 (offset: 0)
2026-06-14T04:38:25.524Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE205A01025 (offset: 0)
2026-06-14T04:38:25.529Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE205A01025 (offset: 0)
2026-06-14T04:38:25.538Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE205A01025 (offset: 0)
2026-06-14T04:38:25.546Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE205A01025 (offset: 0)
2026-06-14T04:38:25.556Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-102] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE205A01025 (offset: 0)
2026-06-14T04:38:25.574Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.controller.FundamentalController   : Request received for ISIN: INE298J01013
2026-06-14T04:38:25.575Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE298J01013...
2026-06-14T04:38:25.580Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE298J01013
2026-06-14T04:38:25.722Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE027H01010. Rebuilding from history...
2026-06-14T04:38:25.748Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE027H01010 (offset: 0)
2026-06-14T04:38:25.760Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE027H01010 (offset: 0)
2026-06-14T04:38:25.769Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE027H01010 (offset: 0)
2026-06-14T04:38:25.777Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE027H01010 (offset: 0)
2026-06-14T04:38:25.784Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE027H01010 (offset: 0)
2026-06-14T04:38:25.792Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE027H01010 (offset: 0)
2026-06-14T04:38:25.797Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.controller.FundamentalController   : Request received for ISIN: INE974X01010
2026-06-14T04:38:25.797Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.controller.FundamentalController   : Request received for ISIN: INE121A01024
2026-06-14T04:38:25.798Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE974X01010...
2026-06-14T04:38:25.804Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE027H01010 (offset: 0)
2026-06-14T04:38:25.804Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE121A01024...
2026-06-14T04:38:25.805Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE974X01010
2026-06-14T04:38:25.807Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE121A01024
2026-06-14T04:38:25.826Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-106] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE027H01010 (offset: 0)
2026-06-14T04:38:25.913Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE298J01013. Rebuilding from history...
2026-06-14T04:38:25.959Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE298J01013 (offset: 0)
2026-06-14T04:38:25.972Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE298J01013 (offset: 0)
2026-06-14T04:38:25.979Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE298J01013 (offset: 0)
2026-06-14T04:38:25.995Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE298J01013 (offset: 0)
2026-06-14T04:38:26.012Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE298J01013 (offset: 0)
2026-06-14T04:38:26.012Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.controller.FundamentalController   : Request received for ISIN: INE742F01042
2026-06-14T04:38:26.020Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE742F01042...
2026-06-14T04:38:26.022Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE298J01013 (offset: 0)
2026-06-14T04:38:26.022Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE742F01042
2026-06-14T04:38:26.040Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE298J01013 (offset: 0)
2026-06-14T04:38:26.050Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-114] c.v.f.controller.FundamentalController   : Request received for ISIN: INE854D01024
2026-06-14T04:38:26.052Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-114] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE854D01024...
2026-06-14T04:38:26.060Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-114] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE854D01024
2026-06-14T04:38:26.067Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-108] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE298J01013 (offset: 0)
2026-06-14T04:38:26.072Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE974X01010. Rebuilding from history...
2026-06-14T04:38:26.105Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE121A01024. Rebuilding from history...
2026-06-14T04:38:26.108Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE974X01010 (offset: 0)
2026-06-14T04:38:26.118Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE974X01010 (offset: 0)
2026-06-14T04:38:26.127Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE974X01010 (offset: 0)
2026-06-14T04:38:26.139Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE121A01024 (offset: 0)
2026-06-14T04:38:26.153Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE974X01010 (offset: 0)
2026-06-14T04:38:26.160Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE121A01024 (offset: 0)
2026-06-14T04:38:26.173Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE974X01010 (offset: 0)
2026-06-14T04:38:26.184Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE121A01024 (offset: 0)
2026-06-14T04:38:26.190Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE974X01010 (offset: 0)
2026-06-14T04:38:26.197Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE121A01024 (offset: 0)
2026-06-14T04:38:26.209Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE974X01010 (offset: 0)
2026-06-14T04:38:26.210Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE121A01024 (offset: 0)
2026-06-14T04:38:26.222Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-111] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE974X01010 (offset: 0)
2026-06-14T04:38:26.226Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE854D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:26.228Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE854D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:26.234Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE854D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:26.229Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE121A01024 (offset: 0)
2026-06-14T04:38:26.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE854D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:26.243Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE854D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:26.250Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE854D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:26.262Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE854D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:26.261Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE742F01042. Rebuilding from history...
2026-06-14T04:38:26.282Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-114] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE854D01024. Rebuilding from history...
2026-06-14T04:38:26.286Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.controller.FundamentalController   : Request received for ISIN: INE226A01021
2026-06-14T04:38:26.288Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE226A01021...
2026-06-14T04:38:26.290Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE121A01024 (offset: 0)
2026-06-14T04:38:26.292Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE226A01021
2026-06-14T04:38:26.316Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-110] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE121A01024 (offset: 0)
2026-06-14T04:38:26.319Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-114] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE854D01024 (offset: 0)
2026-06-14T04:38:26.326Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:38:26.354Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.controller.FundamentalController   : Request received for ISIN: INE047A01021
2026-06-14T04:38:26.354Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:38:26.354Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE047A01021...
2026-06-14T04:38:26.357Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE047A01021
2026-06-14T04:38:26.369Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:38:26.380Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:38:26.386Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:38:26.396Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:38:26.400Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:38:26.402Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-113] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE742F01042 (offset: 0)
2026-06-14T04:38:26.402Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.controller.FundamentalController   : Request received for ISIN: INE326A01037
2026-06-14T04:38:26.408Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE326A01037...
2026-06-14T04:38:26.414Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE326A01037
2026-06-14T04:38:26.576Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE226A01021. Rebuilding from history...
2026-06-14T04:38:26.615Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE047A01021. Rebuilding from history...
2026-06-14T04:38:26.632Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE226A01021 (offset: 0)
2026-06-14T04:38:26.649Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE226A01021 (offset: 0)
2026-06-14T04:38:26.649Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE047A01021 (offset: 0)
2026-06-14T04:38:26.656Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.controller.FundamentalController   : Request received for ISIN: INE414G01012
2026-06-14T04:38:26.662Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE414G01012...
2026-06-14T04:38:26.664Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE414G01012
2026-06-14T04:38:26.665Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE226A01021 (offset: 0)
2026-06-14T04:38:26.676Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE047A01021 (offset: 0)
2026-06-14T04:38:26.703Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE047A01021 (offset: 0)
2026-06-14T04:38:26.703Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE226A01021 (offset: 0)
2026-06-14T04:38:26.720Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE226A01021 (offset: 0)
2026-06-14T04:38:26.732Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE047A01021 (offset: 0)
2026-06-14T04:38:26.743Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE226A01021 (offset: 0)
2026-06-14T04:38:26.748Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE047A01021 (offset: 0)
2026-06-14T04:38:26.760Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.controller.FundamentalController   : Request received for ISIN: INE584A01023
2026-06-14T04:38:26.766Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE226A01021 (offset: 0)
2026-06-14T04:38:26.771Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE584A01023...
2026-06-14T04:38:26.773Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE047A01021 (offset: 0)
2026-06-14T04:38:26.783Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE584A01023
2026-06-14T04:38:26.802Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-118] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE226A01021 (offset: 0)
2026-06-14T04:38:26.802Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE047A01021 (offset: 0)
2026-06-14T04:38:26.817Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE326A01037. Rebuilding from history...
2026-06-14T04:38:26.828Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-120] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE047A01021 (offset: 0)
2026-06-14T04:38:26.860Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE326A01037 (offset: 0)
2026-06-14T04:38:26.861Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.controller.FundamentalController   : Request received for ISIN: INE669E01016
2026-06-14T04:38:26.862Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE669E01016...
2026-06-14T04:38:26.872Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE669E01016
2026-06-14T04:38:26.878Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE326A01037 (offset: 0)
2026-06-14T04:38:26.892Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE326A01037 (offset: 0)
2026-06-14T04:38:26.904Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE326A01037 (offset: 0)
2026-06-14T04:38:26.910Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE326A01037 (offset: 0)
2026-06-14T04:38:26.916Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE326A01037 (offset: 0)
2026-06-14T04:38:26.925Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE326A01037 (offset: 0)
2026-06-14T04:38:26.929Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE414G01012. Rebuilding from history...
2026-06-14T04:38:26.946Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-121] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE326A01037 (offset: 0)
2026-06-14T04:38:26.988Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE414G01012 (offset: 0)
2026-06-14T04:38:27.007Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE414G01012 (offset: 0)
2026-06-14T04:38:27.018Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE414G01012 (offset: 0)
2026-06-14T04:38:27.027Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE414G01012 (offset: 0)
2026-06-14T04:38:27.034Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE414G01012 (offset: 0)
2026-06-14T04:38:27.040Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE414G01012 (offset: 0)
2026-06-14T04:38:27.046Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE414G01012 (offset: 0)
2026-06-14T04:38:27.054Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-123] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE414G01012 (offset: 0)
2026-06-14T04:38:27.110Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-129] c.v.f.controller.FundamentalController   : Request received for ISIN: INE211B01039
2026-06-14T04:38:27.111Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-129] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE211B01039...
2026-06-14T04:38:27.116Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-129] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE211B01039
2026-06-14T04:38:27.190Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE584A01023. Rebuilding from history...
2026-06-14T04:38:27.244Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE584A01023 (offset: 0)
2026-06-14T04:38:27.250Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE669E01016. Rebuilding from history...
2026-06-14T04:38:27.257Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE211B01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:27.260Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE211B01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:27.261Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE584A01023 (offset: 0)
2026-06-14T04:38:27.264Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE211B01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:27.265Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE211B01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:27.281Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE669E01016 (offset: 0)
2026-06-14T04:38:27.282Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.controller.FundamentalController   : Request received for ISIN: INE213A01029
2026-06-14T04:38:27.282Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE584A01023 (offset: 0)
2026-06-14T04:38:27.288Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE211B01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:27.292Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE213A01029...
2026-06-14T04:38:27.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE584A01023 (offset: 0)
2026-06-14T04:38:27.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE213A01029
2026-06-14T04:38:27.304Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.controller.FundamentalController   : Request received for ISIN: INE066P01011
2026-06-14T04:38:27.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE669E01016 (offset: 0)
2026-06-14T04:38:27.313Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE211B01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:27.317Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE584A01023 (offset: 0)
2026-06-14T04:38:27.313Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE066P01011...
2026-06-14T04:38:27.323Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE669E01016 (offset: 0)
2026-06-14T04:38:27.324Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE584A01023 (offset: 0)
2026-06-14T04:38:27.323Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE066P01011
2026-06-14T04:38:27.331Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-129] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE211B01039. Rebuilding from history...
2026-06-14T04:38:27.360Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE669E01016 (offset: 0)
2026-06-14T04:38:27.372Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE584A01023 (offset: 0)
2026-06-14T04:38:27.382Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE669E01016 (offset: 0)
2026-06-14T04:38:27.394Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE669E01016 (offset: 0)
2026-06-14T04:38:27.394Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-125] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE584A01023 (offset: 0)
2026-06-14T04:38:27.415Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-129] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE211B01039 (offset: 0)
2026-06-14T04:38:27.418Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE669E01016 (offset: 0)
2026-06-14T04:38:27.441Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-129] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE211B01039 (offset: 0)
2026-06-14T04:38:27.446Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-126] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE669E01016 (offset: 0)
2026-06-14T04:38:27.553Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE213A01029. Rebuilding from history...
2026-06-14T04:38:27.614Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE213A01029 (offset: 0)
2026-06-14T04:38:27.630Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE213A01029 (offset: 0)
2026-06-14T04:38:27.640Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE213A01029 (offset: 0)
2026-06-14T04:38:27.650Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE213A01029 (offset: 0)
2026-06-14T04:38:27.656Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE213A01029 (offset: 0)
2026-06-14T04:38:27.662Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE213A01029 (offset: 0)
2026-06-14T04:38:27.669Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE213A01029 (offset: 0)
2026-06-14T04:38:27.677Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-130] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE213A01029 (offset: 0)
2026-06-14T04:38:27.691Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE066P01011. Rebuilding from history...
2026-06-14T04:38:27.713Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE066P01011 (offset: 0)
2026-06-14T04:38:27.722Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE066P01011 (offset: 0)
2026-06-14T04:38:27.731Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE066P01011 (offset: 0)
2026-06-14T04:38:27.738Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE066P01011 (offset: 0)
2026-06-14T04:38:27.745Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE066P01011 (offset: 0)
2026-06-14T04:38:27.751Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE066P01011 (offset: 0)
2026-06-14T04:38:27.758Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE066P01011 (offset: 0)
2026-06-14T04:38:27.767Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-131] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE066P01011 (offset: 0)
2026-06-14T04:38:27.923Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.controller.FundamentalController   : Request received for ISIN: INE704P01025
2026-06-14T04:38:27.924Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE704P01025...
2026-06-14T04:38:27.928Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE704P01025
2026-06-14T04:38:28.139Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.controller.FundamentalController   : Request received for ISIN: INE053F01010
2026-06-14T04:38:28.141Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE053F01010...
2026-06-14T04:38:28.148Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE053F01010
2026-06-14T04:38:28.198Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE704P01025. Rebuilding from history...
2026-06-14T04:38:28.232Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE704P01025 (offset: 0)
2026-06-14T04:38:28.242Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE704P01025 (offset: 0)
2026-06-14T04:38:28.251Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE704P01025 (offset: 0)
2026-06-14T04:38:28.259Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE704P01025 (offset: 0)
2026-06-14T04:38:28.265Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE704P01025 (offset: 0)
2026-06-14T04:38:28.276Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE704P01025 (offset: 0)
2026-06-14T04:38:28.284Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE704P01025 (offset: 0)
2026-06-14T04:38:28.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-136] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE704P01025 (offset: 0)
2026-06-14T04:38:28.403Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE053F01010. Rebuilding from history...
2026-06-14T04:38:28.430Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE053F01010 (offset: 0)
2026-06-14T04:38:28.443Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE053F01010 (offset: 0)
2026-06-14T04:38:28.450Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE053F01010 (offset: 0)
2026-06-14T04:38:28.457Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE053F01010 (offset: 0)
2026-06-14T04:38:28.469Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE053F01010 (offset: 0)
2026-06-14T04:38:28.476Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE053F01010 (offset: 0)
2026-06-14T04:38:28.484Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE053F01010 (offset: 0)
2026-06-14T04:38:28.492Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.controller.FundamentalController   : Request received for ISIN: INE021A01026
2026-06-14T04:38:28.495Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE021A01026...
2026-06-14T04:38:28.497Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE021A01026
2026-06-14T04:38:28.501Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-138] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE053F01010 (offset: 0)
2026-06-14T04:38:28.529Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.controller.FundamentalController   : Request received for ISIN: INE931S01010
2026-06-14T04:38:28.530Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE931S01010...
2026-06-14T04:38:28.531Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE931S01010
2026-06-14T04:38:28.722Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.controller.FundamentalController   : Request received for ISIN: INE127D01025
2026-06-14T04:38:28.725Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE127D01025...
2026-06-14T04:38:28.728Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE127D01025
2026-06-14T04:38:28.772Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE021A01026. Rebuilding from history...
2026-06-14T04:38:28.809Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE021A01026 (offset: 0)
2026-06-14T04:38:28.819Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE021A01026 (offset: 0)
2026-06-14T04:38:28.826Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE021A01026 (offset: 0)
2026-06-14T04:38:28.835Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE021A01026 (offset: 0)
2026-06-14T04:38:28.842Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE021A01026 (offset: 0)
2026-06-14T04:38:28.850Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE021A01026 (offset: 0)
2026-06-14T04:38:28.862Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE021A01026 (offset: 0)
2026-06-14T04:38:28.867Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-140] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE021A01026 (offset: 0)
2026-06-14T04:38:28.887Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.controller.FundamentalController   : Request received for ISIN: INE356A01018
2026-06-14T04:38:28.889Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE356A01018...
2026-06-14T04:38:28.890Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE356A01018
2026-06-14T04:38:28.948Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE931S01010. Rebuilding from history...
2026-06-14T04:38:28.983Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE127D01025. Rebuilding from history...
2026-06-14T04:38:28.995Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE931S01010 (offset: 0)
2026-06-14T04:38:29.014Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE931S01010 (offset: 0)
2026-06-14T04:38:29.028Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE931S01010 (offset: 0)
2026-06-14T04:38:29.028Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE127D01025 (offset: 0)
2026-06-14T04:38:29.051Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE127D01025 (offset: 0)
2026-06-14T04:38:29.051Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE931S01010 (offset: 0)
2026-06-14T04:38:29.074Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE127D01025 (offset: 0)
2026-06-14T04:38:29.075Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE931S01010 (offset: 0)
2026-06-14T04:38:29.096Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE931S01010 (offset: 0)
2026-06-14T04:38:29.098Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE127D01025 (offset: 0)
2026-06-14T04:38:29.107Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE931S01010 (offset: 0)
2026-06-14T04:38:29.114Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE127D01025 (offset: 0)
2026-06-14T04:38:29.119Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-141] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE931S01010 (offset: 0)
2026-06-14T04:38:29.134Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE127D01025 (offset: 0)
2026-06-14T04:38:29.144Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE356A01018. Rebuilding from history...
2026-06-14T04:38:29.150Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE127D01025 (offset: 0)
2026-06-14T04:38:29.160Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-143] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE127D01025 (offset: 0)
2026-06-14T04:38:29.170Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.controller.FundamentalController   : Request received for ISIN: INE022Q01020
2026-06-14T04:38:29.171Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE022Q01020...
2026-06-14T04:38:29.171Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE356A01018 (offset: 0)
2026-06-14T04:38:29.172Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE022Q01020
2026-06-14T04:38:29.181Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE356A01018 (offset: 0)
2026-06-14T04:38:29.185Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE356A01018 (offset: 0)
2026-06-14T04:38:29.188Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE356A01018 (offset: 0)
2026-06-14T04:38:29.190Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE356A01018 (offset: 0)
2026-06-14T04:38:29.193Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE356A01018 (offset: 0)
2026-06-14T04:38:29.200Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE356A01018 (offset: 0)
2026-06-14T04:38:29.204Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-146] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE356A01018 (offset: 0)
2026-06-14T04:38:29.313Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.controller.FundamentalController   : Request received for ISIN: INE733E01010
2026-06-14T04:38:29.315Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE733E01010...
2026-06-14T04:38:29.319Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE733E01010
2026-06-14T04:38:29.427Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE022Q01020. Rebuilding from history...
2026-06-14T04:38:29.436Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.controller.FundamentalController   : Request received for ISIN: INE596I01020
2026-06-14T04:38:29.449Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE596I01020...
2026-06-14T04:38:29.458Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE596I01020
2026-06-14T04:38:29.484Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE022Q01020 (offset: 0)
2026-06-14T04:38:29.507Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE022Q01020 (offset: 0)
2026-06-14T04:38:29.520Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE022Q01020 (offset: 0)
2026-06-14T04:38:29.525Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE022Q01020 (offset: 0)
2026-06-14T04:38:29.527Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE022Q01020 (offset: 0)
2026-06-14T04:38:29.529Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE022Q01020 (offset: 0)
2026-06-14T04:38:29.530Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE022Q01020 (offset: 0)
2026-06-14T04:38:29.532Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-149] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE022Q01020 (offset: 0)
2026-06-14T04:38:29.590Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE733E01010. Rebuilding from history...
2026-06-14T04:38:29.617Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE733E01010 (offset: 0)
2026-06-14T04:38:29.626Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE733E01010 (offset: 0)
2026-06-14T04:38:29.632Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.controller.FundamentalController   : Request received for ISIN: INE115A01026
2026-06-14T04:38:29.634Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE733E01010 (offset: 0)
2026-06-14T04:38:29.635Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE115A01026...
2026-06-14T04:38:29.639Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE115A01026
2026-06-14T04:38:29.655Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE733E01010 (offset: 0)
2026-06-14T04:38:29.674Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE733E01010 (offset: 0)
2026-06-14T04:38:29.678Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE733E01010 (offset: 0)
2026-06-14T04:38:29.688Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE733E01010 (offset: 0)
2026-06-14T04:38:29.690Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE596I01020. Rebuilding from history...
2026-06-14T04:38:29.700Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-150] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE733E01010 (offset: 0)
2026-06-14T04:38:29.701Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-155] c.v.f.controller.FundamentalController   : Request received for ISIN: INE702C01027
2026-06-14T04:38:29.709Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-155] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE702C01027...
2026-06-14T04:38:29.714Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-155] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE702C01027
2026-06-14T04:38:29.724Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE596I01020 (offset: 0)
2026-06-14T04:38:29.739Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE596I01020 (offset: 0)
2026-06-14T04:38:29.747Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE596I01020 (offset: 0)
2026-06-14T04:38:29.754Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE596I01020 (offset: 0)
2026-06-14T04:38:29.761Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE596I01020 (offset: 0)
2026-06-14T04:38:29.768Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE596I01020 (offset: 0)
2026-06-14T04:38:29.774Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE596I01020 (offset: 0)
2026-06-14T04:38:29.781Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-151] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE596I01020 (offset: 0)
2026-06-14T04:38:29.812Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-156] c.v.f.controller.FundamentalController   : Request received for ISIN: INE388Y01029
2026-06-14T04:38:29.814Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-156] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE388Y01029...
2026-06-14T04:38:29.816Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-156] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE388Y01029
2026-06-14T04:38:29.862Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE702C01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.867Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE702C01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.870Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE702C01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.887Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE702C01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.888Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE702C01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.890Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE702C01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.895Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-155] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE702C01027. Rebuilding from history...
2026-06-14T04:38:29.915Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-157] c.v.f.controller.FundamentalController   : Request received for ISIN: INE117A01022
2026-06-14T04:38:29.918Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-157] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE117A01022...
2026-06-14T04:38:29.923Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-157] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE117A01022
2026-06-14T04:38:29.924Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-155] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE702C01027 (offset: 0)
2026-06-14T04:38:29.938Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-155] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE702C01027 (offset: 0)
2026-06-14T04:38:29.967Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE388Y01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.969Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE388Y01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.972Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE115A01026. Rebuilding from history...
2026-06-14T04:38:29.983Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE388Y01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.989Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE388Y01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.992Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE388Y01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.997Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE388Y01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:29.999Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE388Y01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.000Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE388Y01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.004Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-156] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE388Y01029. Rebuilding from history...
2026-06-14T04:38:30.008Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE115A01026 (offset: 0)
2026-06-14T04:38:30.012Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE115A01026 (offset: 0)
2026-06-14T04:38:30.017Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE115A01026 (offset: 0)
2026-06-14T04:38:30.020Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE115A01026 (offset: 0)
2026-06-14T04:38:30.022Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE117A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.026Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE115A01026 (offset: 0)
2026-06-14T04:38:30.033Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE115A01026 (offset: 0)
2026-06-14T04:38:30.036Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE115A01026 (offset: 0)
2026-06-14T04:38:30.040Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-153] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE115A01026 (offset: 0)
2026-06-14T04:38:30.044Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE117A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.047Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE117A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.095Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE117A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.096Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE117A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.097Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE117A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.100Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE117A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.101Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE117A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.108Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-157] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE117A01022. Rebuilding from history...
2026-06-14T04:38:30.217Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-165] c.v.f.controller.FundamentalController   : Request received for ISIN: INE239A01024
2026-06-14T04:38:30.218Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-165] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE239A01024...
2026-06-14T04:38:30.222Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-165] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE239A01024
2026-06-14T04:38:30.226Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-166] c.v.f.controller.FundamentalController   : Request received for ISIN: INE437A01024
2026-06-14T04:38:30.231Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-166] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE437A01024...
2026-06-14T04:38:30.232Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-166] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE437A01024
2026-06-14T04:38:30.255Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-168] c.v.f.controller.FundamentalController   : Request received for ISIN: INE053A01029
2026-06-14T04:38:30.255Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-168] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE053A01029...
2026-06-14T04:38:30.255Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-168] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE053A01029
2026-06-14T04:38:30.257Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-169] c.v.f.controller.FundamentalController   : Request received for ISIN: INE245A01021
2026-06-14T04:38:30.260Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-169] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE245A01021...
2026-06-14T04:38:30.261Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-169] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE245A01021
2026-06-14T04:38:30.274Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-172] c.v.f.controller.FundamentalController   : Request received for ISIN: INE196A01026
2026-06-14T04:38:30.274Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-172] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE196A01026...
2026-06-14T04:38:30.276Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-172] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE196A01026
2026-06-14T04:38:30.277Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-171] c.v.f.controller.FundamentalController   : Request received for ISIN: INE121E01018
2026-06-14T04:38:30.277Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-171] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE121E01018...
2026-06-14T04:38:30.278Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-171] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE121E01018
2026-06-14T04:38:30.279Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-170] c.v.f.controller.FundamentalController   : Request received for ISIN: INE121J01017
2026-06-14T04:38:30.280Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-170] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE121J01017...
2026-06-14T04:38:30.280Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-170] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE121J01017
2026-06-14T04:38:30.290Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-174] c.v.f.controller.FundamentalController   : Request received for ISIN: INE019A01038
2026-06-14T04:38:30.290Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-174] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE019A01038...
2026-06-14T04:38:30.290Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-174] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE019A01038
2026-06-14T04:38:30.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-176] c.v.f.controller.FundamentalController   : Request received for ISIN: INE296A01032
2026-06-14T04:38:30.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-176] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE296A01032...
2026-06-14T04:38:30.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-176] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE296A01032
2026-06-14T04:38:30.303Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-177] c.v.f.controller.FundamentalController   : Request received for ISIN: INE522F01014
2026-06-14T04:38:30.304Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-177] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE522F01014...
2026-06-14T04:38:30.304Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-177] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE522F01014
2026-06-14T04:38:30.360Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE239A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.373Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE239A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.374Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE239A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.383Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE239A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.402Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE239A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.410Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE437A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.410Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE437A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.415Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE239A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.417Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE239A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.417Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE239A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.419Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE437A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.421Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE437A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.422Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE437A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.421Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-165] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE239A01024. Rebuilding from history...
2026-06-14T04:38:30.423Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE437A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.424Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE053A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.425Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE437A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.426Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE053A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.427Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE053A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.428Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE053A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.430Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE437A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.434Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-166] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE437A01024. Rebuilding from history...
2026-06-14T04:38:30.445Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE245A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.448Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE053A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.461Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE245A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.461Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE245A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.461Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE245A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.462Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE245A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.461Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE245A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.483Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE245A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.484Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE053A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.484Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE053A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.484Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE245A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.484Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE196A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.486Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-180] c.v.f.controller.FundamentalController   : Request received for ISIN: INE095N01031
2026-06-14T04:38:30.487Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-180] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE095N01031...
2026-06-14T04:38:30.487Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-169] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE245A01021. Rebuilding from history...
2026-06-14T04:38:30.488Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-180] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE095N01031
2026-06-14T04:38:30.488Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE053A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.488Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE196A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.490Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE121J01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.500Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE196A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.490Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE121E01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.491Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-181] c.v.f.controller.FundamentalController   : Request received for ISIN: INE066F01020
2026-06-14T04:38:30.498Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE121E01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.502Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-168] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE053A01029. Rebuilding from history...
2026-06-14T04:38:30.502Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE121E01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.506Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-181] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE066F01020...
2026-06-14T04:38:30.508Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-181] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE066F01020
2026-06-14T04:38:30.523Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-183] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-14T04:38:30.523Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-183] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE002A01018...
2026-06-14T04:38:30.524Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-183] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE002A01018
2026-06-14T04:38:30.530Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE196A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.530Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE121E01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.530Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE121J01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.532Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE196A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.533Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE196A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.533Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE121J01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.533Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE121J01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.537Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-185] c.v.f.controller.FundamentalController   : Request received for ISIN: INE467B01029
2026-06-14T04:38:30.538Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-185] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE467B01029...
2026-06-14T04:38:30.539Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-185] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE467B01029
2026-06-14T04:38:30.548Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE196A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.548Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE121J01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.570Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE121E01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.571Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE121J01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.572Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE121J01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.583Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE196A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.584Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE121E01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.585Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-172] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE196A01026. Rebuilding from history...
2026-06-14T04:38:30.586Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE121J01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.588Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE019A01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.589Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE121E01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.587Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE121E01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.592Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-170] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE121J01017. Rebuilding from history...
2026-06-14T04:38:30.593Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-171] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE121E01018. Rebuilding from history...
2026-06-14T04:38:30.636Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-189] c.v.f.controller.FundamentalController   : Request received for ISIN: INE079A01024
2026-06-14T04:38:30.636Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-189] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE079A01024...
2026-06-14T04:38:30.636Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-189] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE079A01024
2026-06-14T04:38:30.639Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-190] c.v.f.controller.FundamentalController   : Request received for ISIN: INE457L01029
2026-06-14T04:38:30.639Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-190] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE457L01029...
2026-06-14T04:38:30.640Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-190] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE457L01029
2026-06-14T04:38:30.640Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-191] c.v.f.controller.FundamentalController   : Request received for ISIN: INE0J1Y01017
2026-06-14T04:38:30.641Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-191] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE0J1Y01017...
2026-06-14T04:38:30.646Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-191] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE0J1Y01017
2026-06-14T04:38:30.698Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE019A01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.700Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE019A01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.701Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE019A01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.702Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE019A01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.703Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE019A01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.704Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE019A01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.704Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE019A01038. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.705Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE296A01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.705Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE296A01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.706Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE296A01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.706Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE296A01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.707Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-174] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE019A01038. Rebuilding from history...
2026-06-14T04:38:30.710Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE296A01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.710Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE296A01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.711Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE522F01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.712Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE296A01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.712Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE296A01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.717Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE522F01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.718Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE522F01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.718Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE522F01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.723Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE522F01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.723Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE522F01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.724Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-176] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE296A01032. Rebuilding from history...
2026-06-14T04:38:30.724Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE522F01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.725Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE522F01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.727Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-177] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE522F01014. Rebuilding from history...
2026-06-14T04:38:30.782Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-195] c.v.f.controller.FundamentalController   : Request received for ISIN: INE260B01028
2026-06-14T04:38:30.782Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-195] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE260B01028...
2026-06-14T04:38:30.783Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-195] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE260B01028
2026-06-14T04:38:30.783Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE095N01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.785Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE095N01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.786Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE095N01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.790Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-196] c.v.f.controller.FundamentalController   : Request received for ISIN: INE299U01018
2026-06-14T04:38:30.790Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-196] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE299U01018...
2026-06-14T04:38:30.790Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-196] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE299U01018
2026-06-14T04:38:30.793Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-197] c.v.f.controller.FundamentalController   : Request received for ISIN: INE040A01034
2026-06-14T04:38:30.794Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-197] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE040A01034...
2026-06-14T04:38:30.795Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-197] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE040A01034
2026-06-14T04:38:30.809Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE095N01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.811Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE095N01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.813Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE095N01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.814Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE095N01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.815Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE095N01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.817Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-180] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE095N01031. Rebuilding from history...
2026-06-14T04:38:30.847Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE066F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.850Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE066F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.851Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-199] c.v.f.controller.FundamentalController   : Request received for ISIN: INE200A01026
2026-06-14T04:38:30.852Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-199] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE200A01026...
2026-06-14T04:38:30.852Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE066F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.852Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-199] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE200A01026
2026-06-14T04:38:30.856Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE066F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.856Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE066F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.856Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE002A01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.856Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE066F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.858Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE066F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.859Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE066F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.861Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-181] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE066F01020. Rebuilding from history...
2026-06-14T04:38:30.886Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-201] c.v.f.controller.FundamentalController   : Request received for ISIN: INE371P01015
2026-06-14T04:38:30.887Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-201] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE371P01015...
2026-06-14T04:38:30.892Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-201] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE371P01015
2026-06-14T04:38:30.893Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE002A01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.894Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE002A01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.895Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE002A01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.896Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE002A01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.898Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE002A01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.898Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE002A01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.921Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE002A01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.922Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE467B01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.923Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE467B01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.923Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-183] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE002A01018. Rebuilding from history...
2026-06-14T04:38:30.926Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE467B01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.938Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE467B01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.939Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE467B01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.940Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE467B01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.941Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE467B01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.943Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE467B01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.945Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-185] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE467B01029. Rebuilding from history...
2026-06-14T04:38:30.953Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-203] c.v.f.controller.FundamentalController   : Request received for ISIN: INE603J01030
2026-06-14T04:38:30.954Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-203] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE603J01030...
2026-06-14T04:38:30.955Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-203] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE603J01030
2026-06-14T04:38:30.963Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE079A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.965Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE079A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.966Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE079A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.966Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE079A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.967Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE079A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.968Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE079A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.969Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-205] c.v.f.controller.FundamentalController   : Request received for ISIN: INE202E01016
2026-06-14T04:38:30.969Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-205] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE202E01016...
2026-06-14T04:38:30.970Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-205] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE202E01016
2026-06-14T04:38:30.971Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE079A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.972Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE457L01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.974Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE079A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:30.975Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-189] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE079A01024. Rebuilding from history...
2026-06-14T04:38:30.995Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-207] c.v.f.controller.FundamentalController   : Request received for ISIN: INE663F01032
2026-06-14T04:38:30.995Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-207] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE663F01032...
2026-06-14T04:38:30.996Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-207] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE663F01032
2026-06-14T04:38:31.000Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE457L01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.001Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE457L01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.002Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE457L01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.002Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE457L01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.011Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE457L01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.013Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE457L01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.016Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE457L01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.017Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE0J1Y01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.018Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE0J1Y01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.018Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-190] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE457L01029. Rebuilding from history...
2026-06-14T04:38:31.018Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE0J1Y01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.041Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE0J1Y01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.043Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE0J1Y01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.044Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE0J1Y01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.045Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE0J1Y01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.045Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE0J1Y01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.049Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE260B01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.051Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-191] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE0J1Y01017. Rebuilding from history...
2026-06-14T04:38:31.052Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE260B01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.053Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE260B01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.053Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE260B01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.059Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE260B01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.061Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-209] c.v.f.controller.FundamentalController   : Request received for ISIN: INE066A01021
2026-06-14T04:38:31.062Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-209] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE066A01021...
2026-06-14T04:38:31.063Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-209] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE066A01021
2026-06-14T04:38:31.075Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-211] c.v.f.controller.FundamentalController   : Request received for ISIN: INE752E01010
2026-06-14T04:38:31.076Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-211] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE752E01010...
2026-06-14T04:38:31.077Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-211] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE752E01010
2026-06-14T04:38:31.082Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE260B01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.083Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE299U01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.084Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE299U01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.085Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE260B01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.087Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE260B01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.087Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE299U01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.088Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE299U01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.089Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-195] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE260B01028. Rebuilding from history...
2026-06-14T04:38:31.108Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE299U01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.116Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-213] c.v.f.controller.FundamentalController   : Request received for ISIN: INE271C01023
2026-06-14T04:38:31.117Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-213] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE271C01023...
2026-06-14T04:38:31.118Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-213] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE271C01023
2026-06-14T04:38:31.129Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE299U01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.130Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE299U01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.131Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE040A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.132Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE299U01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.134Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-196] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE299U01018. Rebuilding from history...
2026-06-14T04:38:31.134Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE040A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.136Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE040A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.137Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE040A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.138Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE040A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.142Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE040A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.143Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE040A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.143Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE200A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.143Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE200A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.143Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE040A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.144Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE200A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.145Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE200A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.144Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE200A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.145Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-197] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE040A01034. Rebuilding from history...
2026-06-14T04:38:31.163Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE200A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.164Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE200A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.164Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE200A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.165Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE371P01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.165Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE371P01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.166Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-199] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE200A01026. Rebuilding from history...
2026-06-14T04:38:31.171Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE371P01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.173Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-216] c.v.f.controller.FundamentalController   : Request received for ISIN: INE318A01026
2026-06-14T04:38:31.174Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE371P01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.173Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE371P01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.173Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE371P01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.172Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE371P01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.175Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-216] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE318A01026...
2026-06-14T04:38:31.176Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-216] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE318A01026
2026-06-14T04:38:31.178Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-217] c.v.f.controller.FundamentalController   : Request received for ISIN: INE947Q01028
2026-06-14T04:38:31.178Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-217] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE947Q01028...
2026-06-14T04:38:31.179Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-217] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE947Q01028
2026-06-14T04:38:31.180Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE371P01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.181Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE603J01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.182Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-201] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE371P01015. Rebuilding from history...
2026-06-14T04:38:31.183Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE603J01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.187Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE603J01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.192Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE603J01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.192Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE603J01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.197Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-219] c.v.f.controller.FundamentalController   : Request received for ISIN: INE918I01026
2026-06-14T04:38:31.198Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-219] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE918I01026...
2026-06-14T04:38:31.199Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-219] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE918I01026
2026-06-14T04:38:31.203Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE603J01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.204Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE603J01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.208Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE603J01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.210Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-203] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE603J01030. Rebuilding from history...
2026-06-14T04:38:31.209Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE202E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.211Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-221] c.v.f.controller.FundamentalController   : Request received for ISIN: INE758E01017
2026-06-14T04:38:31.212Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-221] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE758E01017...
2026-06-14T04:38:31.212Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-221] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE758E01017
2026-06-14T04:38:31.214Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE202E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.220Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE202E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.220Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE202E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.221Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE202E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.221Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE202E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.221Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE202E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.224Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE663F01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.225Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE202E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.227Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-205] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE202E01016. Rebuilding from history...
2026-06-14T04:38:31.237Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-223] c.v.f.controller.FundamentalController   : Request received for ISIN: INE089A01031
2026-06-14T04:38:31.238Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-223] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE089A01031...
2026-06-14T04:38:31.239Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-223] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE089A01031
2026-06-14T04:38:31.242Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE663F01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.246Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE663F01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.247Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE663F01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.248Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE663F01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.253Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE663F01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.255Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE663F01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.255Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE066A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.255Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-225] c.v.f.controller.FundamentalController   : Request received for ISIN: INE848E01016
2026-06-14T04:38:31.256Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE663F01032. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.256Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-225] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE848E01016...
2026-06-14T04:38:31.257Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE066A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.256Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE066A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.257Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE066A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.258Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-225] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE848E01016
2026-06-14T04:38:31.258Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-207] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE663F01032. Rebuilding from history...
2026-06-14T04:38:31.259Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE066A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.260Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE066A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.262Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE066A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.262Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE752E01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.266Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE066A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.272Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE752E01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.272Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE752E01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.272Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-209] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE066A01021. Rebuilding from history...
2026-06-14T04:38:31.277Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE752E01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.277Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE752E01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.281Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE752E01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.283Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE752E01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.283Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE752E01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.287Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE271C01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.288Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-211] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE752E01010. Rebuilding from history...
2026-06-14T04:38:31.297Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE271C01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.298Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE271C01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.299Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE271C01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.297Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE271C01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.300Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE318A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.306Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE318A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.305Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE271C01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.310Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE271C01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.332Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE271C01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.336Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE318A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.338Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE318A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.349Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-213] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE271C01023. Rebuilding from history...
2026-06-14T04:38:31.347Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE318A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.350Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE318A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.356Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE947Q01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.357Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE318A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.358Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-228] c.v.f.controller.FundamentalController   : Request received for ISIN: INE982J01020
2026-06-14T04:38:31.359Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE318A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.367Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE947Q01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.365Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-228] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE982J01020...
2026-06-14T04:38:31.371Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-216] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE318A01026. Rebuilding from history...
2026-06-14T04:38:31.365Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE947Q01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.369Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE947Q01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.377Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-228] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE982J01020
2026-06-14T04:38:31.370Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE947Q01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.402Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE947Q01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.405Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-230] c.v.f.controller.FundamentalController   : Request received for ISIN: INE761H01022
2026-06-14T04:38:31.406Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-230] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE761H01022...
2026-06-14T04:38:31.410Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE947Q01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.412Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-230] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE761H01022
2026-06-14T04:38:31.413Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE918I01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.433Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE918I01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.440Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE947Q01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.443Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-232] c.v.f.controller.FundamentalController   : Request received for ISIN: INE451A01017
2026-06-14T04:38:31.444Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE918I01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.447Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE918I01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.452Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE918I01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.453Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-232] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE451A01017...
2026-06-14T04:38:31.459Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE918I01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.464Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE918I01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.464Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-217] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE947Q01028. Rebuilding from history...
2026-06-14T04:38:31.470Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE918I01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.499Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE089A01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.476Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE758E01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.501Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE089A01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.482Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE758E01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.483Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE758E01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.484Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-232] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE451A01017
2026-06-14T04:38:31.515Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE089A01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.484Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE758E01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.517Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE089A01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.517Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE089A01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.490Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE758E01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.492Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE758E01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.507Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE758E01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.507Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE089A01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.507Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE758E01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.508Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE089A01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.512Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE848E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.526Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-219] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE918I01026. Rebuilding from history...
2026-06-14T04:38:31.529Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-221] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE758E01017. Rebuilding from history...
2026-06-14T04:38:31.563Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-234] c.v.f.controller.FundamentalController   : Request received for ISIN: INE494B01023
2026-06-14T04:38:31.564Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-234] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE494B01023...
2026-06-14T04:38:31.570Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-235] c.v.f.controller.FundamentalController   : Request received for ISIN: INE646L01027
2026-06-14T04:38:31.566Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-234] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE494B01023
2026-06-14T04:38:31.571Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-235] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE646L01027...
2026-06-14T04:38:31.572Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE848E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.576Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-235] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE646L01027
2026-06-14T04:38:31.565Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE089A01031. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.593Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-223] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE089A01031. Rebuilding from history...
2026-06-14T04:38:31.596Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE848E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.592Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE848E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.600Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE848E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.606Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE848E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.608Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE848E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.611Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE848E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.613Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE982J01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.620Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE982J01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.621Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE982J01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.624Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE761H01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.626Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE982J01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.621Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE982J01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.621Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE761H01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.621Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE982J01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.621Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE982J01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.621Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE761H01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.622Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE761H01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.622Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE761H01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.622Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE761H01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.625Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE982J01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.629Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-239] c.v.f.controller.FundamentalController   : Request received for ISIN: INE0V6F01027
2026-06-14T04:38:31.627Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE761H01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.630Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-239] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE0V6F01027...
2026-06-14T04:38:31.630Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-239] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE0V6F01027
2026-06-14T04:38:31.629Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-225] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE848E01016. Rebuilding from history...
2026-06-14T04:38:31.635Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-228] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE982J01020. Rebuilding from history...
2026-06-14T04:38:31.626Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE761H01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.648Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-230] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE761H01022. Rebuilding from history...
2026-06-14T04:38:31.672Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE451A01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.673Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE451A01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.674Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE451A01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.679Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE451A01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.680Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE451A01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.681Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE451A01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.696Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE451A01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.701Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE451A01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.707Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE494B01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.699Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-240] c.v.f.controller.FundamentalController   : Request received for ISIN: INE010B01027
2026-06-14T04:38:31.721Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-232] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE451A01017. Rebuilding from history...
2026-06-14T04:38:31.721Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-240] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE010B01027...
2026-06-14T04:38:31.725Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-240] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE010B01027
2026-06-14T04:38:31.740Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-244] c.v.f.controller.FundamentalController   : Request received for ISIN: INE302A01020
2026-06-14T04:38:31.743Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-244] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE302A01020...
2026-06-14T04:38:31.757Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-244] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE302A01020
2026-06-14T04:38:31.791Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-246] c.v.f.controller.FundamentalController   : Request received for ISIN: INE634S01028
2026-06-14T04:38:31.837Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-246] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE634S01028...
2026-06-14T04:38:31.844Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE494B01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.844Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-246] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE634S01028
2026-06-14T04:38:31.844Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE494B01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.850Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE494B01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.863Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-247] c.v.f.controller.FundamentalController   : Request received for ISIN: INE397D01024
2026-06-14T04:38:31.865Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-247] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE397D01024...
2026-06-14T04:38:31.866Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-248] c.v.f.controller.FundamentalController   : Request received for ISIN: INE192R01011
2026-06-14T04:38:31.867Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE494B01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.872Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE494B01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.867Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-247] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE397D01024
2026-06-14T04:38:31.881Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-250] c.v.f.controller.FundamentalController   : Request received for ISIN: INE059A01026
2026-06-14T04:38:31.873Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-248] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE192R01011...
2026-06-14T04:38:31.896Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE646L01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.884Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE646L01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.895Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE646L01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.907Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-248] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE192R01011
2026-06-14T04:38:31.926Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE0V6F01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.893Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE646L01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.897Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-250] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE059A01026...
2026-06-14T04:38:31.908Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE646L01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.909Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE494B01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.909Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE646L01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.910Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE494B01023. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.938Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE0V6F01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.922Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE0V6F01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.932Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE646L01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.941Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE0V6F01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.947Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE0V6F01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.950Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE0V6F01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.949Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-250] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE059A01026
2026-06-14T04:38:31.915Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE646L01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.955Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE0V6F01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.958Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE0V6F01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.962Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE010B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.963Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE010B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.964Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-235] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE646L01027. Rebuilding from history...
2026-06-14T04:38:31.965Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE010B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.972Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE010B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.972Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE010B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.973Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE010B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.972Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE010B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.972Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE302A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.972Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE010B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.973Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE302A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:31.978Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-234] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE494B01023. Rebuilding from history...
2026-06-14T04:38:31.982Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-240] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE010B01027. Rebuilding from history...
2026-06-14T04:38:31.998Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-239] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE0V6F01027. Rebuilding from history...
2026-06-14T04:38:32.001Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-251] c.v.f.controller.FundamentalController   : Request received for ISIN: INE732I01021
2026-06-14T04:38:32.002Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-251] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE732I01021...
2026-06-14T04:38:32.003Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-251] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE732I01021
2026-06-14T04:38:32.018Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE302A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.025Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE302A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.027Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE302A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.029Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE302A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.032Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE302A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.035Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE302A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.037Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE634S01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.038Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-244] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE302A01020. Rebuilding from history...
2026-06-14T04:38:32.041Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE634S01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.041Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE634S01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.042Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE634S01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.044Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-253] c.v.f.controller.FundamentalController   : Request received for ISIN: INE138Y01010
2026-06-14T04:38:32.044Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE634S01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.045Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-253] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE138Y01010...
2026-06-14T04:38:32.051Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-253] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE138Y01010
2026-06-14T04:38:32.053Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE397D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.057Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE634S01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.059Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE634S01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.059Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE634S01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.062Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-246] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE634S01028. Rebuilding from history...
2026-06-14T04:38:32.062Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE397D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.067Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE397D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.068Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE397D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.070Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE397D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.071Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE397D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.072Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE397D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.073Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE397D01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.076Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-247] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE397D01024. Rebuilding from history...
2026-06-14T04:38:32.086Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE059A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.095Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE059A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.095Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE059A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.098Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE192R01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.096Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE059A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.105Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-256] c.v.f.controller.FundamentalController   : Request received for ISIN: INE797F01020
2026-06-14T04:38:32.106Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-256] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE797F01020...
2026-06-14T04:38:32.106Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-256] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE797F01020
2026-06-14T04:38:32.127Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE059A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.129Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE059A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.134Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE192R01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.139Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE192R01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.147Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE192R01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.148Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE059A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.150Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE192R01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.151Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE192R01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.151Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE732I01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.157Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE192R01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.163Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE192R01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.164Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-258] c.v.f.controller.FundamentalController   : Request received for ISIN: INE180A01020
2026-06-14T04:38:32.164Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE059A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.170Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE732I01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.173Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-248] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE192R01011. Rebuilding from history...
2026-06-14T04:38:32.175Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-258] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE180A01020...
2026-06-14T04:38:32.181Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-258] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE180A01020
2026-06-14T04:38:32.180Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE732I01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.185Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE732I01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.187Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE732I01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.193Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE732I01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.195Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE732I01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.195Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE732I01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.199Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE138Y01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.200Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-250] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE059A01026. Rebuilding from history...
2026-06-14T04:38:32.207Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE138Y01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.208Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE138Y01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.209Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-251] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE732I01021. Rebuilding from history...
2026-06-14T04:38:32.209Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE138Y01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.210Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE138Y01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.210Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE138Y01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.211Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE138Y01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.217Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-262] c.v.f.controller.FundamentalController   : Request received for ISIN: INE949L01017
2026-06-14T04:38:32.218Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-262] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE949L01017...
2026-06-14T04:38:32.222Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-262] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE949L01017
2026-06-14T04:38:32.232Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-264] c.v.f.controller.FundamentalController   : Request received for ISIN: INE795G01014
2026-06-14T04:38:32.233Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-263] c.v.f.controller.FundamentalController   : Request received for ISIN: INE881D01027
2026-06-14T04:38:32.233Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-264] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE795G01014...
2026-06-14T04:38:32.235Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-263] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE881D01027...
2026-06-14T04:38:32.235Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-264] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE795G01014
2026-06-14T04:38:32.241Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-263] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE881D01027
2026-06-14T04:38:32.248Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-267] c.v.f.controller.FundamentalController   : Request received for ISIN: INE148I01020
2026-06-14T04:38:32.248Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE797F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE797F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.249Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-267] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE148I01020...
2026-06-14T04:38:32.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE797F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.248Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE138Y01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE797F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.248Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE797F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE797F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE797F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.250Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-267] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE148I01020
2026-06-14T04:38:32.255Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-253] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE138Y01010. Rebuilding from history...
2026-06-14T04:38:32.265Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE797F01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.266Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-256] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE797F01020. Rebuilding from history...
2026-06-14T04:38:32.270Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-269] c.v.f.controller.FundamentalController   : Request received for ISIN: INE280A01028
2026-06-14T04:38:32.271Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-270] c.v.f.controller.FundamentalController   : Request received for ISIN: INE298A01020
2026-06-14T04:38:32.271Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-269] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE280A01028...
2026-06-14T04:38:32.273Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-270] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE298A01020...
2026-06-14T04:38:32.274Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-270] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE298A01020
2026-06-14T04:38:32.274Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-269] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE280A01028
2026-06-14T04:38:32.280Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-271] c.v.f.controller.FundamentalController   : Request received for ISIN: INE155A01022
2026-06-14T04:38:32.280Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-271] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE155A01022...
2026-06-14T04:38:32.280Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-271] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE155A01022
2026-06-14T04:38:32.286Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE180A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.290Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE180A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-274] c.v.f.controller.FundamentalController   : Request received for ISIN: INE274J01014
2026-06-14T04:38:32.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-275] c.v.f.controller.FundamentalController   : Request received for ISIN: INE944F01028
2026-06-14T04:38:32.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-274] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE274J01014...
2026-06-14T04:38:32.301Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-275] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE944F01028...
2026-06-14T04:38:32.301Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-274] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE274J01014
2026-06-14T04:38:32.303Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-275] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE944F01028
2026-06-14T04:38:32.321Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE180A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE180A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE180A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.323Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE180A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.324Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE180A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.324Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE180A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.325Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE949L01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.326Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-258] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE180A01020. Rebuilding from history...
2026-06-14T04:38:32.327Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE949L01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.333Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE949L01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.337Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE949L01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.338Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE949L01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.339Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE949L01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.340Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE949L01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.341Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE949L01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.342Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-262] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE949L01017. Rebuilding from history...
2026-06-14T04:38:32.343Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-277] c.v.f.controller.FundamentalController   : Request received for ISIN: INE572E01012
2026-06-14T04:38:32.344Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-277] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE572E01012...
2026-06-14T04:38:32.344Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-277] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE572E01012
2026-06-14T04:38:32.348Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE795G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.361Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE795G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.362Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE795G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.363Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-279] c.v.f.controller.FundamentalController   : Request received for ISIN: INE095A01012
2026-06-14T04:38:32.363Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-279] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE095A01012...
2026-06-14T04:38:32.364Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-279] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE095A01012
2026-06-14T04:38:32.362Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE795G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.366Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE795G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.369Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE795G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.378Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE795G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.378Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE795G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.380Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-264] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE795G01014. Rebuilding from history...
2026-06-14T04:38:32.380Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE881D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.394Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-281] c.v.f.controller.FundamentalController   : Request received for ISIN: INE562A01011
2026-06-14T04:38:32.395Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-281] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE562A01011...
2026-06-14T04:38:32.396Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-281] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE562A01011
2026-06-14T04:38:32.404Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE881D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.404Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE881D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.405Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE881D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.405Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE881D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.406Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE148I01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.407Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE881D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.408Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE881D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.408Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE881D01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.409Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE148I01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.410Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-263] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE881D01027. Rebuilding from history...
2026-06-14T04:38:32.412Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE148I01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.427Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-283] c.v.f.controller.FundamentalController   : Request received for ISIN: INE195A01028
2026-06-14T04:38:32.428Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-283] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE195A01028...
2026-06-14T04:38:32.428Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-283] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE195A01028
2026-06-14T04:38:32.567Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE148I01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.569Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE148I01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.570Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE148I01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.570Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE148I01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.573Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE148I01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.581Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE298A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.582Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE280A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.582Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE280A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.583Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE280A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.587Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE298A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.598Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE280A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.599Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE280A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.613Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE298A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.610Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-267] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE148I01020. Rebuilding from history...
2026-06-14T04:38:32.618Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE298A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.631Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE280A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.632Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE280A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.635Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE298A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.636Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE298A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.653Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE298A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.658Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE280A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.663Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-269] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE280A01028. Rebuilding from history...
2026-06-14T04:38:32.713Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-285] c.v.f.controller.FundamentalController   : Request received for ISIN: INE118H01025
2026-06-14T04:38:32.714Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-285] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE118H01025...
2026-06-14T04:38:32.716Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-285] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE118H01025
2026-06-14T04:38:32.751Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-287] c.v.f.controller.FundamentalController   : Request received for ISIN: INE364U01010
2026-06-14T04:38:32.752Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-287] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE364U01010...
2026-06-14T04:38:32.755Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-287] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE364U01010
2026-06-14T04:38:32.813Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE155A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.816Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE298A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.824Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE155A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:32.831Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-270] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE298A01020. Rebuilding from history...
2026-06-14T04:38:32.943Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-289] c.v.f.controller.FundamentalController   : Request received for ISIN: INE238A01034
2026-06-14T04:38:32.945Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-289] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE238A01034...
2026-06-14T04:38:32.948Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-289] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE238A01034
2026-06-14T04:38:33.142Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE155A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.146Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE155A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.150Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE155A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.155Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE155A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.226Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE274J01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.229Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE155A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.232Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE155A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.238Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-271] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE155A01022. Rebuilding from history...
2026-06-14T04:38:33.263Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE274J01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.273Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE274J01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.274Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE274J01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.277Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE274J01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.279Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE274J01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.282Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE274J01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.289Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE944F01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.292Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE944F01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.293Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE944F01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.295Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE274J01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.296Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE944F01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.300Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-274] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE274J01014. Rebuilding from history...
2026-06-14T04:38:33.302Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE944F01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.315Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE944F01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.309Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE944F01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.310Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE572E01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.309Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE944F01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.317Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE572E01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.324Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE572E01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.317Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE572E01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.319Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE572E01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.326Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE572E01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.325Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE572E01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.327Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE572E01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.332Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE095A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.332Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-275] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE944F01028. Rebuilding from history...
2026-06-14T04:38:33.338Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-277] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE572E01012. Rebuilding from history...
2026-06-14T04:38:33.340Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE095A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.341Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE095A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.343Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE095A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.351Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE095A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.350Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE095A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.352Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE095A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.352Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE562A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.362Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE562A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.352Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE095A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.352Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE562A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.352Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE562A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.352Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE562A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.352Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE562A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.356Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-291] c.v.f.controller.FundamentalController   : Request received for ISIN: INE044A01036
2026-06-14T04:38:33.371Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-291] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE044A01036...
2026-06-14T04:38:33.363Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE562A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.363Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE562A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.371Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-291] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE044A01036
2026-06-14T04:38:33.378Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-279] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE095A01012. Rebuilding from history...
2026-06-14T04:38:33.384Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-281] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE562A01011. Rebuilding from history...
2026-06-14T04:38:33.405Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE195A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.408Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE195A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.409Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE195A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.416Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE195A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.418Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE118H01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.422Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE195A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.428Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE195A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.428Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE195A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.426Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-294] c.v.f.controller.FundamentalController   : Request received for ISIN: INE338I01027
2026-06-14T04:38:33.426Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE195A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.426Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE118H01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.440Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-294] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE338I01027...
2026-06-14T04:38:33.442Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-294] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE338I01027
2026-06-14T04:38:33.443Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-283] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE195A01028. Rebuilding from history...
2026-06-14T04:38:33.448Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE118H01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.451Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE118H01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.452Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE118H01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.454Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE118H01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.456Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE118H01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.458Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-296] c.v.f.controller.FundamentalController   : Request received for ISIN: INE935N01020
2026-06-14T04:38:33.458Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE364U01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.459Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-296] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE935N01020...
2026-06-14T04:38:33.461Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE118H01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.461Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE364U01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.462Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE238A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.459Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE364U01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.463Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE364U01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.465Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-296] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE935N01020
2026-06-14T04:38:33.466Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE238A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.466Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE364U01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.466Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-285] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE118H01025. Rebuilding from history...
2026-06-14T04:38:33.467Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE364U01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.468Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE238A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.467Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE364U01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.469Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE364U01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.469Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE238A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.471Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE238A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.472Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE238A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.472Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-287] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE364U01010. Rebuilding from history...
2026-06-14T04:38:33.473Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE238A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.474Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE238A01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.476Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-289] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE238A01034. Rebuilding from history...
2026-06-14T04:38:33.490Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE044A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.491Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE044A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.493Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE044A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.493Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE044A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.493Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE044A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.495Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE044A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.494Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE044A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.495Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE044A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.499Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-291] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE044A01036. Rebuilding from history...
2026-06-14T04:38:33.530Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE338I01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.532Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE338I01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.534Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE338I01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.540Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE338I01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.543Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE338I01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.558Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-299] c.v.f.controller.FundamentalController   : Request received for ISIN: INE038A01020
2026-06-14T04:38:33.560Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-299] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE038A01020...
2026-06-14T04:38:33.564Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-299] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE038A01020
2026-06-14T04:38:33.564Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE338I01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.573Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE338I01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.585Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE338I01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.585Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE935N01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.587Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE935N01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.590Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE935N01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.590Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-294] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE338I01027. Rebuilding from history...
2026-06-14T04:38:33.590Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE935N01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.596Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE935N01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.596Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-301] c.v.f.controller.FundamentalController   : Request received for ISIN: INE242A01010
2026-06-14T04:38:33.600Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-301] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE242A01010...
2026-06-14T04:38:33.601Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-301] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE242A01010
2026-06-14T04:38:33.603Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE935N01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.605Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE935N01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.606Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE935N01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.614Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-296] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE935N01020. Rebuilding from history...
2026-06-14T04:38:33.641Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-303] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T04:38:33.644Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-303] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T04:38:33.645Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-303] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE692A01016
2026-06-14T04:38:33.676Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE038A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.681Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE038A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.684Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE038A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.687Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE038A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.688Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE038A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.689Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE038A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.692Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE038A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.696Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE038A01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.698Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-299] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE038A01020. Rebuilding from history...
2026-06-14T04:38:33.698Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE242A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.699Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE242A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.699Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE242A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.704Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-307] c.v.f.controller.FundamentalController   : Request received for ISIN: INE04I401011
2026-06-14T04:38:33.705Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-307] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE04I401011...
2026-06-14T04:38:33.706Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-307] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE04I401011
2026-06-14T04:38:33.725Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE242A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.726Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE242A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.729Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE242A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.730Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE242A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.732Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE242A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.733Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-301] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE242A01010. Rebuilding from history...
2026-06-14T04:38:33.733Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE692A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.745Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-310] c.v.f.controller.FundamentalController   : Request received for ISIN: INE061F01013
2026-06-14T04:38:33.746Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-310] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE061F01013...
2026-06-14T04:38:33.746Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-310] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE061F01013
2026-06-14T04:38:33.754Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-312] c.v.f.controller.FundamentalController   : Request received for ISIN: INE685A01028
2026-06-14T04:38:33.754Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-312] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE685A01028...
2026-06-14T04:38:33.756Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-312] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE685A01028
2026-06-14T04:38:33.757Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-311] c.v.f.controller.FundamentalController   : Request received for ISIN: INE020B01018
2026-06-14T04:38:33.759Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-313] c.v.f.controller.FundamentalController   : Request received for ISIN: INE263A01024
2026-06-14T04:38:33.763Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-313] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE263A01024...
2026-06-14T04:38:33.764Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE692A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.763Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-311] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE020B01018...
2026-06-14T04:38:33.765Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE692A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.765Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-311] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE020B01018
2026-06-14T04:38:33.768Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-314] c.v.f.controller.FundamentalController   : Request received for ISIN: INE647A01010
2026-06-14T04:38:33.769Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE692A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.769Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE692A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.770Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE692A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.770Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-314] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE647A01010...
2026-06-14T04:38:33.770Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-313] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE263A01024
2026-06-14T04:38:33.771Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-314] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE647A01010
2026-06-14T04:38:33.779Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE692A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.779Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE692A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.780Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-303] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE692A01016. Rebuilding from history...
2026-06-14T04:38:33.783Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-317] c.v.f.controller.FundamentalController   : Request received for ISIN: INE860A01027
2026-06-14T04:38:33.783Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-317] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE860A01027...
2026-06-14T04:38:33.784Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-317] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE860A01027
2026-06-14T04:38:33.793Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-318] c.v.f.controller.FundamentalController   : Request received for ISIN: INE00H001014
2026-06-14T04:38:33.793Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-318] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE00H001014...
2026-06-14T04:38:33.794Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-318] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE00H001014
2026-06-14T04:38:33.797Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-319] c.v.f.controller.FundamentalController   : Request received for ISIN: INE0BS701011
2026-06-14T04:38:33.797Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-319] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE0BS701011...
2026-06-14T04:38:33.798Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-319] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE0BS701011
2026-06-14T04:38:33.804Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE04I401011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.809Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-321] c.v.f.controller.FundamentalController   : Request received for ISIN: INE171A01029
2026-06-14T04:38:33.810Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-321] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE171A01029...
2026-06-14T04:38:33.811Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-321] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE171A01029
2026-06-14T04:38:33.814Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE04I401011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.815Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE04I401011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.816Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE04I401011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.816Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE04I401011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.817Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE04I401011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.818Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE04I401011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.819Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE04I401011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.820Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-307] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE04I401011. Rebuilding from history...
2026-06-14T04:38:33.855Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-323] c.v.f.controller.FundamentalController   : Request received for ISIN: INE976G01028
2026-06-14T04:38:33.856Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-323] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE976G01028...
2026-06-14T04:38:33.857Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE061F01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.856Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE061F01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.859Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-323] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE976G01028
2026-06-14T04:38:33.865Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE061F01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.865Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE061F01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.865Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE061F01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.865Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE061F01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.884Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE685A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.890Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE685A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.885Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE685A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.892Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE685A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.893Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE685A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.893Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE685A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.894Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE685A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.885Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE061F01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.889Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE061F01013. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.904Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-310] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE061F01013. Rebuilding from history...
2026-06-14T04:38:33.905Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE020B01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.907Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE020B01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.909Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE685A01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.910Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE020B01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.918Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE020B01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.919Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE020B01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.917Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE020B01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.922Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-312] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE685A01028. Rebuilding from history...
2026-06-14T04:38:33.930Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE020B01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.935Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE020B01018. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.937Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE263A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.937Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE263A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.938Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-311] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE020B01018. Rebuilding from history...
2026-06-14T04:38:33.938Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE263A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.941Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE263A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.939Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE263A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.941Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE647A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.940Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE263A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.942Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE647A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.942Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE647A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.943Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE263A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.945Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE263A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.947Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE647A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.954Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE647A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.955Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE647A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.958Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-313] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE263A01024. Rebuilding from history...
2026-06-14T04:38:33.958Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE647A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.959Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE860A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.960Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE647A01010. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.960Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE860A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.962Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE860A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.962Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE860A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.963Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-314] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE647A01010. Rebuilding from history...
2026-06-14T04:38:33.968Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE860A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.968Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE860A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.973Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE00H001014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.974Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE860A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.975Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE00H001014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.977Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE00H001014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.976Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE00H001014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.976Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE00H001014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.976Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE00H001014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.985Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE00H001014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.978Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE860A01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.986Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE0BS701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.987Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE00H001014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.987Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE0BS701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.988Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE0BS701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.988Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-317] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE860A01027. Rebuilding from history...
2026-06-14T04:38:33.988Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE0BS701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.991Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-318] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE00H001014. Rebuilding from history...
2026-06-14T04:38:33.993Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE0BS701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.993Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE0BS701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:33.994Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE0BS701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.000Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE171A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.002Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE0BS701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.001Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE171A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.003Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE171A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.002Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE171A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.002Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE171A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.006Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-319] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE0BS701011. Rebuilding from history...
2026-06-14T04:38:34.010Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE171A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.010Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE976G01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.011Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE171A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.012Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE171A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.012Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE976G01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.013Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-321] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE171A01029. Rebuilding from history...
2026-06-14T04:38:34.013Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE976G01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.016Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE976G01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.016Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE976G01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.018Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE976G01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.019Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE976G01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.020Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE976G01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.021Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-323] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE976G01028. Rebuilding from history...
2026-06-14T04:38:34.101Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-328] c.v.f.controller.FundamentalController   : Request received for ISIN: INE262H01021
2026-06-14T04:38:34.102Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-328] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE262H01021...
2026-06-14T04:38:34.103Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-328] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE262H01021
2026-06-14T04:38:34.116Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-330] c.v.f.controller.FundamentalController   : Request received for ISIN: INE775A01035
2026-06-14T04:38:34.117Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-330] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE775A01035...
2026-06-14T04:38:34.118Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-330] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE775A01035
2026-06-14T04:38:34.120Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-332] c.v.f.controller.FundamentalController   : Request received for ISIN: INE084A01016
2026-06-14T04:38:34.120Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-332] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE084A01016...
2026-06-14T04:38:34.124Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-332] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE084A01016
2026-06-14T04:38:34.138Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-335] c.v.f.controller.FundamentalController   : Request received for ISIN: INE878B01027
2026-06-14T04:38:34.139Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-335] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE878B01027...
2026-06-14T04:38:34.140Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-335] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE878B01027
2026-06-14T04:38:34.168Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-338] c.v.f.controller.FundamentalController   : Request received for ISIN: INE018E01016
2026-06-14T04:38:34.169Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-338] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE018E01016...
2026-06-14T04:38:34.171Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-338] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE018E01016
2026-06-14T04:38:34.225Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-339] c.v.f.controller.FundamentalController   : Request received for ISIN: INE776C01039
2026-06-14T04:38:34.226Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-339] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE776C01039...
2026-06-14T04:38:34.227Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-339] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE776C01039
2026-06-14T04:38:34.229Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-340] c.v.f.controller.FundamentalController   : Request received for ISIN: INE417T01026
2026-06-14T04:38:34.236Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-340] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE417T01026...
2026-06-14T04:38:34.237Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-341] c.v.f.controller.FundamentalController   : Request received for ISIN: INE415G01027
2026-06-14T04:38:34.239Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-341] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE415G01027...
2026-06-14T04:38:34.239Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-340] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE417T01026
2026-06-14T04:38:34.241Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE262H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.241Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-341] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE415G01027
2026-06-14T04:38:34.242Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE262H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE262H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.263Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE262H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.264Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-342] c.v.f.controller.FundamentalController   : Request received for ISIN: INE323A01026
2026-06-14T04:38:34.268Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE262H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.264Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE262H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.266Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-343] c.v.f.controller.FundamentalController   : Request received for ISIN: INE214T01019
2026-06-14T04:38:34.266Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE262H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.268Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-342] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE323A01026...
2026-06-14T04:38:34.271Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-343] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE214T01019...
2026-06-14T04:38:34.268Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE262H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.273Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-343] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE214T01019
2026-06-14T04:38:34.273Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE775A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.278Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-342] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE323A01026
2026-06-14T04:38:34.285Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-328] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE262H01021. Rebuilding from history...
2026-06-14T04:38:34.298Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE775A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.298Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE084A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.304Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE084A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.306Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE775A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.312Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE775A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.313Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE775A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.320Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE084A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.321Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE775A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE084A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE084A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.325Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE878B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE775A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE084A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE878B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.324Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE878B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.324Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE775A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.326Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE878B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE084A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.324Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE084A01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.334Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-332] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE084A01016. Rebuilding from history...
2026-06-14T04:38:34.337Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE878B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.337Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE018E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.337Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE018E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.337Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE878B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.337Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE878B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.337Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE878B01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.343Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-330] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE775A01035. Rebuilding from history...
2026-06-14T04:38:34.347Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE018E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.350Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE018E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.348Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE018E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.354Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE018E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.354Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE776C01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.355Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE018E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.354Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE018E01016. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.355Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE776C01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.358Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-345] c.v.f.controller.FundamentalController   : Request received for ISIN: INE176B01034
2026-06-14T04:38:34.366Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-335] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE878B01027. Rebuilding from history...
2026-06-14T04:38:34.367Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE776C01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.368Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-338] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE018E01016. Rebuilding from history...
2026-06-14T04:38:34.368Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-345] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE176B01034...
2026-06-14T04:38:34.373Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE776C01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.380Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE776C01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.380Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE776C01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.381Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE776C01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.385Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE417T01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.387Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-345] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE176B01034
2026-06-14T04:38:34.387Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE417T01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.392Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE776C01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.394Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE415G01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.395Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE415G01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.396Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE415G01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.398Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE415G01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.397Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE415G01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.393Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE415G01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.399Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-339] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE776C01039. Rebuilding from history...
2026-06-14T04:38:34.418Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE417T01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.420Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-347] c.v.f.controller.FundamentalController   : Request received for ISIN: INE545U01014
2026-06-14T04:38:34.424Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE417T01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.429Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE415G01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.429Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE415G01027. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.429Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-347] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE545U01014...
2026-06-14T04:38:34.435Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE417T01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.436Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE417T01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.437Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE417T01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.439Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE417T01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.440Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE214T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.441Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE214T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.441Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE214T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.442Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-347] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE545U01014
2026-06-14T04:38:34.446Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-341] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE415G01027. Rebuilding from history...
2026-06-14T04:38:34.462Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE214T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.476Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE323A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.447Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE214T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.454Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE214T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.456Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-340] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE417T01026. Rebuilding from history...
2026-06-14T04:38:34.466Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE214T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.471Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE214T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.480Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE323A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.510Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-343] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE214T01019. Rebuilding from history...
2026-06-14T04:38:34.551Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE323A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.555Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE323A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.560Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE323A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.565Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE323A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.568Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE323A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.578Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE323A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.583Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-342] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE323A01026. Rebuilding from history...
2026-06-14T04:38:34.584Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE176B01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.589Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE176B01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.598Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE176B01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.601Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE176B01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.602Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE176B01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.605Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE176B01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.606Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE176B01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.606Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE176B01034. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.609Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE545U01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.610Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE545U01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.610Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE545U01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.610Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE545U01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.612Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-345] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE176B01034. Rebuilding from history...
2026-06-14T04:38:34.610Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE545U01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.610Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE545U01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.611Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE545U01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.613Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE545U01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.617Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-347] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE545U01014. Rebuilding from history...
2026-06-14T04:38:34.705Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-350] c.v.f.controller.FundamentalController   : Request received for ISIN: INE249Z01020
2026-06-14T04:38:34.707Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-350] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE249Z01020...
2026-06-14T04:38:34.710Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-350] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE249Z01020
2026-06-14T04:38:34.845Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE249Z01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.847Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE249Z01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.848Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE249Z01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.851Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE249Z01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.853Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE249Z01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.855Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE249Z01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.865Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE249Z01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.866Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE249Z01020. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:34.872Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-350] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE249Z01020. Rebuilding from history...
2026-06-14T04:38:35.180Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-352] c.v.f.controller.FundamentalController   : Request received for ISIN: INE343H01029
2026-06-14T04:38:35.182Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-352] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE343H01029...
2026-06-14T04:38:35.186Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-352] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE343H01029
2026-06-14T04:38:35.297Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE343H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.298Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE343H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.299Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE343H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.301Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE343H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.303Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE343H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.304Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE343H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.305Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE343H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.320Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE343H01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.324Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-352] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE343H01029. Rebuilding from history...
2026-06-14T04:38:35.613Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-361] c.v.f.controller.FundamentalController   : Request received for ISIN: INE758T01015
2026-06-14T04:38:35.614Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-361] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE758T01015...
2026-06-14T04:38:35.617Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-361] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE758T01015
2026-06-14T04:38:35.621Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-362] c.v.f.controller.FundamentalController   : Request received for ISIN: INE154A01025
2026-06-14T04:38:35.622Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-362] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE154A01025...
2026-06-14T04:38:35.623Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-362] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE154A01025
2026-06-14T04:38:35.685Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-363] c.v.f.controller.FundamentalController   : Request received for ISIN: INE455K01017
2026-06-14T04:38:35.686Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-363] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE455K01017...
2026-06-14T04:38:35.686Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-363] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE455K01017
2026-06-14T04:38:35.711Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-365] c.v.f.controller.FundamentalController   : Request received for ISIN: INE208A01029
2026-06-14T04:38:35.711Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-365] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE208A01029...
2026-06-14T04:38:35.713Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-365] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE208A01029
2026-06-14T04:38:35.718Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-366] c.v.f.controller.FundamentalController   : Request received for ISIN: INE148O01028
2026-06-14T04:38:35.719Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-366] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE148O01028...
2026-06-14T04:38:35.721Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-366] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE148O01028
2026-06-14T04:38:35.728Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-367] c.v.f.controller.FundamentalController   : Request received for ISIN: INE303R01014
2026-06-14T04:38:35.729Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-367] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE303R01014...
2026-06-14T04:38:35.730Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-367] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE303R01014
2026-06-14T04:38:35.731Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-368] c.v.f.controller.FundamentalController   : Request received for ISIN: INE101A01026
2026-06-14T04:38:35.732Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-368] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE101A01026...
2026-06-14T04:38:35.733Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-368] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE101A01026
2026-06-14T04:38:35.738Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-369] c.v.f.controller.FundamentalController   : Request received for ISIN: INE406A01037
2026-06-14T04:38:35.739Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-369] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE406A01037...
2026-06-14T04:38:35.739Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-369] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE406A01037
2026-06-14T04:38:35.754Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-370] c.v.f.controller.FundamentalController   : Request received for ISIN: INE090A01021
2026-06-14T04:38:35.755Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-370] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE090A01021...
2026-06-14T04:38:35.756Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-370] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE090A01021
2026-06-14T04:38:35.759Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-371] c.v.f.controller.FundamentalController   : Request received for ISIN: INE472A01039
2026-06-14T04:38:35.760Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-371] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE472A01039...
2026-06-14T04:38:35.761Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-371] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE472A01039
2026-06-14T04:38:35.770Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE758T01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.770Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE758T01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.770Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE154A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.770Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE154A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.770Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE154A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.773Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE154A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.778Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE154A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.779Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE154A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.782Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE758T01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.783Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE758T01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.783Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE758T01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.783Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE758T01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.783Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE154A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.783Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE154A01025. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.787Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-362] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE154A01025. Rebuilding from history...
2026-06-14T04:38:35.822Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-373] c.v.f.controller.FundamentalController   : Request received for ISIN: INE628A01036
2026-06-14T04:38:35.823Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-373] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE628A01036...
2026-06-14T04:38:35.827Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-373] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE628A01036
2026-06-14T04:38:35.852Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE455K01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.855Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE758T01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.866Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE758T01015. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.867Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE455K01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.873Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE455K01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.873Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE455K01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.882Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-361] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE758T01015. Rebuilding from history...
2026-06-14T04:38:35.884Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE455K01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.897Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE455K01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.898Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE455K01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.919Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE208A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.922Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE208A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.925Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE208A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.922Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE208A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.924Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE208A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.929Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE455K01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.934Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-363] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE455K01017. Rebuilding from history...
2026-06-14T04:38:35.939Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE208A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.944Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE208A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.947Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE208A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.947Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE148O01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.947Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE148O01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.950Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE148O01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.955Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE148O01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.966Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-365] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE208A01029. Rebuilding from history...
2026-06-14T04:38:35.973Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE148O01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.974Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE148O01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.974Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE148O01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.976Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE303R01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.991Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-375] c.v.f.controller.FundamentalController   : Request received for ISIN: INE040H01021
2026-06-14T04:38:35.976Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE148O01028. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.990Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE303R01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.982Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE303R01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.977Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE303R01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.978Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE101A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.983Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE101A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.985Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE303R01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.990Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE101A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.991Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE101A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.985Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE101A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.997Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE303R01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.001Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE101A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.993Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-375] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE040H01021...
2026-06-14T04:38:35.998Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE303R01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:35.999Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE101A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.003Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE303R01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE406A01037. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE406A01037. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE406A01037. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.006Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE406A01037. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.004Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-375] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE040H01021
2026-06-14T04:38:36.002Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-366] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE148O01028. Rebuilding from history...
2026-06-14T04:38:36.004Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE406A01037. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.005Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE406A01037. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.005Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE406A01037. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.007Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE101A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.007Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE090A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE406A01037. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.012Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE090A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.020Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE090A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.022Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-367] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE303R01014. Rebuilding from history...
2026-06-14T04:38:36.023Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-369] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE406A01037. Rebuilding from history...
2026-06-14T04:38:36.030Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-368] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE101A01026. Rebuilding from history...
2026-06-14T04:38:36.035Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE090A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.036Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE090A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.036Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE090A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.037Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE472A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.039Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE090A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.039Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE090A01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.042Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-370] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE090A01021. Rebuilding from history...
2026-06-14T04:38:36.057Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE472A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.058Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE472A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.058Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE472A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.059Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE472A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.059Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE472A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.059Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE472A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.060Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE628A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.060Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE472A01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.061Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-379] c.v.f.controller.FundamentalController   : Request received for ISIN: INE018A01030
2026-06-14T04:38:36.060Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE628A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.060Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE628A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.060Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE628A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.060Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE628A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.070Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE628A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.060Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE628A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.066Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-379] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE018A01030...
2026-06-14T04:38:36.069Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE628A01036. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.089Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-379] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE018A01030
2026-06-14T04:38:36.071Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-380] c.v.f.controller.FundamentalController   : Request received for ISIN: INE092T01019
2026-06-14T04:38:36.076Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-371] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE472A01039. Rebuilding from history...
2026-06-14T04:38:36.099Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-380] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE092T01019...
2026-06-14T04:38:36.102Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-380] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE092T01019
2026-06-14T04:38:36.105Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-382] c.v.f.controller.FundamentalController   : Request received for ISIN: INE347G01014
2026-06-14T04:38:36.106Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-373] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE628A01036. Rebuilding from history...
2026-06-14T04:38:36.106Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-382] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE347G01014...
2026-06-14T04:38:36.109Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-382] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE347G01014
2026-06-14T04:38:36.121Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE040H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.122Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE040H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.122Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE040H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.124Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE040H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.126Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE040H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.131Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE040H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.131Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE040H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.132Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE040H01021. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.134Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-375] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE040H01021. Rebuilding from history...
2026-06-14T04:38:36.194Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-385] c.v.f.controller.FundamentalController   : Request received for ISIN: INE067A01029
2026-06-14T04:38:36.196Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-385] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE067A01029...
2026-06-14T04:38:36.198Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-385] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE067A01029
2026-06-14T04:38:36.209Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE018A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.215Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE018A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.215Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE018A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.215Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE018A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.216Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE018A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.217Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE018A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.225Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE018A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.226Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE018A01030. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.227Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE092T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.227Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE092T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.229Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE092T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.229Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-379] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE018A01030. Rebuilding from history...
2026-06-14T04:38:36.246Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE092T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.247Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE092T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.250Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE347G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE092T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE092T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE347G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE347G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.249Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE347G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.253Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE092T01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.254Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE347G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.255Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE347G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.255Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE347G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.256Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE347G01014. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.277Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-380] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE092T01019. Rebuilding from history...
2026-06-14T04:38:36.280Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-382] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE347G01014. Rebuilding from history...
2026-06-14T04:38:36.290Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE067A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.291Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-388] c.v.f.controller.FundamentalController   : Request received for ISIN: INE259A01022
2026-06-14T04:38:36.293Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-388] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE259A01022...
2026-06-14T04:38:36.297Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE067A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.297Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE067A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.297Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-388] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE259A01022
2026-06-14T04:38:36.298Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE067A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.302Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE067A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.312Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE067A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.320Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE067A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.322Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE067A01029. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.325Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-385] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE067A01029. Rebuilding from history...
2026-06-14T04:38:36.328Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-391] c.v.f.controller.FundamentalController   : Request received for ISIN: INE423A01024
2026-06-14T04:38:36.332Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-391] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE423A01024...
2026-06-14T04:38:36.338Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-391] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE423A01024
2026-06-14T04:38:36.365Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-392] c.v.f.controller.FundamentalController   : Request received for ISIN: INE07Y701011
2026-06-14T04:38:36.366Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-392] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE07Y701011...
2026-06-14T04:38:36.373Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-392] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE07Y701011
2026-06-14T04:38:36.408Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE259A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.413Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE259A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.415Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE259A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.441Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE259A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.444Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE259A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.446Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE259A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.448Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE259A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.453Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE259A01022. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.454Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE423A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.460Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE423A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.461Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE423A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.461Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-394] c.v.f.controller.FundamentalController   : Request received for ISIN: INE765G01017
2026-06-14T04:38:36.464Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE423A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.466Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE07Y701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.463Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-388] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE259A01022. Rebuilding from history...
2026-06-14T04:38:36.463Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE423A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.466Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-394] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE765G01017...
2026-06-14T04:38:36.467Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE423A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.469Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE423A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.471Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-394] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE765G01017
2026-06-14T04:38:36.475Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE423A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.484Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-391] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE423A01024. Rebuilding from history...
2026-06-14T04:38:36.487Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE07Y701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.488Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE07Y701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.489Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE07Y701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.500Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: BSE_EQ|INE07Y701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.494Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE07Y701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.501Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE07Y701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.499Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE07Y701011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.523Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-392] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE07Y701011. Rebuilding from history...
2026-06-14T04:38:36.543Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-396] c.v.f.controller.FundamentalController   : Request received for ISIN: INE257A01026
2026-06-14T04:38:36.544Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-396] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE257A01026...
2026-06-14T04:38:36.549Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-396] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE257A01026
2026-06-14T04:38:36.553Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-397] c.v.f.controller.FundamentalController   : Request received for ISIN: INE129A01019
2026-06-14T04:38:36.555Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-397] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE129A01019...
2026-06-14T04:38:36.556Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-397] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE129A01019
2026-06-14T04:38:36.567Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE765G01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.574Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE765G01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.576Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE765G01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.577Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE765G01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.585Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE765G01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.594Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-399] c.v.f.controller.FundamentalController   : Request received for ISIN: INE481G01011
2026-06-14T04:38:36.594Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-399] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE481G01011...
2026-06-14T04:38:36.596Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-399] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE481G01011
2026-06-14T04:38:36.605Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE765G01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.607Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE765G01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.607Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE765G01017. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.610Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-394] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE765G01017. Rebuilding from history...
2026-06-14T04:38:36.650Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-403] c.v.f.controller.FundamentalController   : Request received for ISIN: INE114A01011
2026-06-14T04:38:36.652Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE257A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.656Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE257A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.655Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE257A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.653Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-403] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE114A01011...
2026-06-14T04:38:36.667Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-403] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE114A01011
2026-06-14T04:38:36.668Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-404] c.v.f.controller.FundamentalController   : Request received for ISIN: INE003A01024
2026-06-14T04:38:36.672Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-404] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE003A01024...
2026-06-14T04:38:36.678Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-404] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE003A01024
2026-06-14T04:38:36.717Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-406] c.v.f.controller.FundamentalController   : Request received for ISIN: INE935A01035
2026-06-14T04:38:36.718Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE257A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.723Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-406] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE935A01035...
2026-06-14T04:38:36.723Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-408] c.v.f.controller.FundamentalController   : Request received for ISIN: INE200M01039
2026-06-14T04:38:36.731Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-408] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE200M01039...
2026-06-14T04:38:36.732Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE257A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.731Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-406] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE935A01035
2026-06-14T04:38:36.740Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-408] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE200M01039
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE257A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE257A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE257A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE129A01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE129A01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE129A01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE129A01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE129A01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE129A01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE129A01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE481G01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE481G01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE481G01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE481G01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE129A01019. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.752Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE481G01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.755Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-397] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE129A01019. Rebuilding from history...
2026-06-14T04:38:36.757Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-396] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE257A01026. Rebuilding from history...
2026-06-14T04:38:36.768Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-409] c.v.f.controller.FundamentalController   : Request received for ISIN: INE029A01011
2026-06-14T04:38:36.772Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE481G01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.772Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE481G01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.772Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE481G01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.775Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-399] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE481G01011. Rebuilding from history...
2026-06-14T04:38:36.785Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-409] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE029A01011...
2026-06-14T04:38:36.790Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-409] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE029A01011
2026-06-14T04:38:36.797Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-410] c.v.f.controller.FundamentalController   : Request received for ISIN: INE670A01012
2026-06-14T04:38:36.801Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-410] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE670A01012...
2026-06-14T04:38:36.802Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-410] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE670A01012
2026-06-14T04:38:36.822Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-412] c.v.f.controller.FundamentalController   : Request received for ISIN: INE016A01026
2026-06-14T04:38:36.823Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-412] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE016A01026...
2026-06-14T04:38:36.829Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-412] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE016A01026
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE114A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE114A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE114A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE114A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE114A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE114A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE114A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE114A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE003A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE003A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE003A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE003A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE003A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE003A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE003A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE003A01024. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.831Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE935A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.847Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-403] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE114A01011. Rebuilding from history...
2026-06-14T04:38:36.848Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-404] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE003A01024. Rebuilding from history...
2026-06-14T04:38:36.860Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE935A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.862Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE935A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.863Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE935A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.864Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE935A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.869Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE935A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.871Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE200M01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.872Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE935A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.872Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE935A01035. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.872Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE200M01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.876Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-406] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE935A01035. Rebuilding from history...
2026-06-14T04:38:36.872Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE200M01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.872Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE200M01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.872Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE200M01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.898Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE200M01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.898Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE200M01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.898Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE200M01039. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.898Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE029A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.898Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE029A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.900Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE029A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.904Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE029A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.902Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE029A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:36.907Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-408] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE200M01039. Rebuilding from history...
2026-06-14T04:38:37.008Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE029A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.029Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE016A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.008Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE670A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.030Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE016A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.008Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE029A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.008Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch cash-flow for identifier: INE670A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.008Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE670A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.008Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE670A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.008Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE670A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE029A01011. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE670A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch key-ratios for identifier: INE016A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch share-holdings for identifier: INE670A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE016A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch balance-sheet?fs=true for identifier: INE016A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch profile for identifier: INE016A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.009Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch corporate-actions for identifier: INE016A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.026Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for identifier: NSE_EQ|INE016A01026. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.007Z ERROR 18421 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch income-statement for identifier: INE670A01012. Status code: 429. Body: {"status":"error","errors":[{"errorCode":"UDAPI10005","message":"Too Many Request Sent","propertyPath":null,"invalidValue":null,"error_code":"UDAPI10005","property_path":null,"invalid_value":null}]}
2026-06-14T04:38:37.062Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-409] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE029A01011. Rebuilding from history...
2026-06-14T04:38:37.064Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-410] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE670A01012. Rebuilding from history...
2026-06-14T04:38:37.075Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-412] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE016A01026. Rebuilding from history...
2026-06-14T06:44:37.930Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-422] c.v.f.controller.FundamentalController   : Request received for ISIN: INE749A01030
2026-06-14T06:44:37.930Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-424] c.v.f.controller.FundamentalController   : Request received for ISIN: INE070A01015
2026-06-14T06:44:37.930Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-423] c.v.f.controller.FundamentalController   : Request received for ISIN: INE466L01038
2026-06-14T06:44:37.942Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-422] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE749A01030...
2026-06-14T06:44:37.942Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-424] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE070A01015...
2026-06-14T06:44:37.943Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-423] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE466L01038...
2026-06-14T06:44:38.111Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-422] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE749A01030
2026-06-14T06:44:38.111Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-423] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE466L01038
2026-06-14T06:44:38.118Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-424] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE070A01015
2026-06-14T06:44:38.359Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-425] c.v.f.controller.FundamentalController   : Request received for ISIN: INE267A01025
2026-06-14T06:44:38.361Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-425] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE267A01025...
2026-06-14T06:44:38.403Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-425] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE267A01025
2026-06-14T06:44:38.419Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-426] c.v.f.controller.FundamentalController   : Request received for ISIN: INE171Z01026
2026-06-14T06:44:38.422Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-426] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE171Z01026...
2026-06-14T06:44:38.436Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-426] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE171Z01026
2026-06-14T06:44:38.946Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-428] c.v.f.controller.FundamentalController   : Request received for ISIN: INE00R701025
2026-06-14T06:44:38.949Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-428] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE00R701025...
2026-06-14T06:44:38.988Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-428] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE00R701025
2026-06-14T06:44:39.429Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-431] c.v.f.controller.FundamentalController   : Request received for ISIN: INE917I01010
2026-06-14T06:44:39.433Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-431] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE917I01010...
2026-06-14T06:44:39.500Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-431] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE917I01010
2026-06-14T06:44:39.613Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-433] c.v.f.controller.FundamentalController   : Request received for ISIN: INE591G01025
2026-06-14T06:44:39.614Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-433] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE591G01025...
2026-06-14T06:44:39.657Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-434] c.v.f.controller.FundamentalController   : Request received for ISIN: INE160A01022
2026-06-14T06:44:39.658Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-434] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE160A01022...
2026-06-14T06:44:39.856Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-435] c.v.f.controller.FundamentalController   : Request received for ISIN: INE139A01034
2026-06-14T06:44:39.858Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-435] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE139A01034...
2026-06-14T06:44:39.923Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-436] c.v.f.controller.FundamentalController   : Request received for ISIN: INE522D01027
2026-06-14T06:44:39.924Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-436] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE522D01027...
2026-06-14T06:44:39.925Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-435] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE139A01034
2026-06-14T06:44:39.966Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-436] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE522D01027
2026-06-14T06:44:39.996Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-438] c.v.f.controller.FundamentalController   : Request received for ISIN: INE736A01011
2026-06-14T06:44:40.002Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-438] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE736A01011...
2026-06-14T06:44:40.485Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-440] c.v.f.controller.FundamentalController   : Request received for ISIN: INE814H01029
2026-06-14T06:44:40.486Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-440] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE814H01029...
2026-06-14T06:44:40.699Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-442] c.v.f.controller.FundamentalController   : Request received for ISIN: INE585B01010
2026-06-14T06:44:40.699Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-442] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE585B01010...
2026-06-14T06:44:40.716Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-440] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE814H01029
2026-06-14T06:44:40.736Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-444] c.v.f.controller.FundamentalController   : Request received for ISIN: INE102D01028
2026-06-14T06:44:40.736Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-442] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE585B01010
2026-06-14T06:44:40.737Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-444] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE102D01028...
2026-06-14T06:44:42.120Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-448] c.v.f.controller.FundamentalController   : Request received for ISIN: INE134E01011
2026-06-14T06:44:42.159Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-448] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE134E01011...
2026-06-14T06:44:42.355Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-449] c.v.f.controller.FundamentalController   : Request received for ISIN: INE009A01021
2026-06-14T06:44:42.368Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-449] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE009A01021...
2026-06-14T06:44:42.369Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-433] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE591G01025
2026-06-14T06:44:42.404Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-450] c.v.f.controller.FundamentalController   : Request received for ISIN: INE918Z01012
2026-06-14T06:44:42.406Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-450] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE918Z01012...
2026-06-14T06:44:42.458Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-450] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE918Z01012
2026-06-14T06:44:42.460Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-452] c.v.f.controller.FundamentalController   : Request received for ISIN: INE376G01013
2026-06-14T06:44:42.461Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-452] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE376G01013...
2026-06-14T06:44:42.468Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-453] c.v.f.controller.FundamentalController   : Request received for ISIN: INE619A01035
2026-06-14T06:44:42.472Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-453] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE619A01035...
2026-06-14T06:44:42.477Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-434] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE160A01022
2026-06-14T06:44:42.488Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-438] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE736A01011
2026-06-14T06:44:42.831Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-452] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE376G01013
2026-06-14T06:44:43.064Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-458] c.v.f.controller.FundamentalController   : Request received for ISIN: INE465A01025
2026-06-14T06:44:43.065Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-458] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE465A01025...
2026-06-14T06:44:43.669Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-458] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE465A01025
2026-06-14T06:44:43.666Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-459] c.v.f.controller.FundamentalController   : Request received for ISIN: INE540L01014
2026-06-14T06:44:43.690Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-459] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE540L01014...
2026-06-14T06:44:44.557Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-453] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE619A01035
2026-06-14T06:44:46.659Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-462] c.v.f.controller.FundamentalController   : Request received for ISIN: INE237A01036
2026-06-14T06:44:46.660Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-462] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE237A01036...
2026-06-14T06:44:50.056Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-449] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE009A01021
2026-06-14T06:44:50.899Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-463] c.v.f.controller.FundamentalController   : Request received for ISIN: INE361B01024
2026-06-14T06:44:50.901Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-463] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE361B01024...
2026-06-14T06:44:51.875Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-465] c.v.f.controller.FundamentalController   : Request received for ISIN: INE811K01011
2026-06-14T06:44:51.876Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-465] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE811K01011...
2026-06-14T06:44:52.720Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-462] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE237A01036
2026-06-14T06:44:53.743Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-466] c.v.f.controller.FundamentalController   : Request received for ISIN: INE01EA01019
2026-06-14T06:44:53.744Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-466] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE01EA01019...
2026-06-14T06:44:53.785Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-463] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE361B01024
2026-06-14T06:44:53.847Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-459] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE540L01014
2026-06-14T06:44:53.847Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-469] c.v.f.controller.FundamentalController   : Request received for ISIN: INE030A01027
2026-06-14T06:44:53.848Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-469] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE030A01027...
2026-06-14T06:44:53.871Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-466] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE01EA01019
2026-06-14T06:44:53.907Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-469] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE030A01027
2026-06-14T06:44:53.914Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-471] c.v.f.controller.FundamentalController   : Request received for ISIN: INE476A01022
2026-06-14T06:44:53.915Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-471] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE476A01022...
2026-06-14T06:44:53.958Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-473] c.v.f.controller.FundamentalController   : Request received for ISIN: INE745G01043
2026-06-14T06:44:53.959Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-475] c.v.f.controller.FundamentalController   : Request received for ISIN: INE721A01047
2026-06-14T06:44:53.965Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-475] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE721A01047...
2026-06-14T06:44:53.965Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-473] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE745G01043...
2026-06-14T06:44:53.990Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-444] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE102D01028
2026-06-14T06:44:53.997Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-471] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE476A01022
2026-06-14T06:44:54.017Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-476] c.v.f.controller.FundamentalController   : Request received for ISIN: INE028A01039
2026-06-14T06:44:54.019Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-476] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE028A01039...
2026-06-14T06:44:54.021Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-475] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE721A01047
2026-06-14T06:44:54.038Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-473] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE745G01043
2026-06-14T06:44:54.050Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-479] c.v.f.controller.FundamentalController   : Request received for ISIN: INE670K01029
2026-06-14T06:44:54.050Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-479] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE670K01029...
2026-06-14T06:44:54.103Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-476] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE028A01039
2026-06-14T06:44:54.109Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-482] c.v.f.controller.FundamentalController   : Request received for ISIN: INE158A01026
2026-06-14T06:44:54.109Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-482] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE158A01026...
2026-06-14T06:44:54.147Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-448] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE134E01011
2026-06-14T06:44:54.147Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-485] c.v.f.controller.FundamentalController   : Request received for ISIN: INE123W01016
2026-06-14T06:44:54.148Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-485] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE123W01016...
2026-06-14T06:44:54.149Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-487] c.v.f.controller.FundamentalController   : Request received for ISIN: INE118A01012
2026-06-14T06:44:54.149Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-487] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE118A01012...
2026-06-14T06:44:54.146Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-484] c.v.f.controller.FundamentalController   : Request received for ISIN: INE405E01023
2026-06-14T06:44:54.152Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-484] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE405E01023...
2026-06-14T06:44:54.147Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-486] c.v.f.controller.FundamentalController   : Request received for ISIN: INE192A01025
2026-06-14T06:44:54.154Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-486] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE192A01025...
2026-06-14T06:44:54.181Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-488] c.v.f.controller.FundamentalController   : Request received for ISIN: INE674K01013
2026-06-14T06:44:54.182Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-488] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE674K01013...
2026-06-14T06:44:54.195Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-479] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE670K01029
2026-06-14T06:44:54.208Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-482] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE158A01026
2026-06-14T06:44:54.216Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-488] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE674K01013
2026-06-14T06:44:54.248Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-490] c.v.f.controller.FundamentalController   : Request received for ISIN: INE094A01015
2026-06-14T06:44:54.248Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-490] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE094A01015...
2026-06-14T06:44:54.260Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-465] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE811K01011
2026-06-14T06:44:54.276Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-487] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE118A01012
2026-06-14T06:44:54.281Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-490] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE094A01015
2026-06-14T06:44:54.334Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-497] c.v.f.controller.FundamentalController   : Request received for ISIN: INE528G01035
2026-06-14T06:44:54.340Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-497] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE528G01035...
2026-06-14T06:44:54.415Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-497] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE528G01035
2026-06-14T06:44:54.896Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-498] c.v.f.controller.FundamentalController   : Request received for ISIN: INE531F01023
2026-06-14T06:44:54.901Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-498] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE531F01023...
2026-06-14T06:44:55.017Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-498] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE531F01023
2026-06-14T06:44:55.097Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-500] c.v.f.controller.FundamentalController   : Request received for ISIN: INE726G01019
2026-06-14T06:44:55.111Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-500] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE726G01019...
2026-06-14T06:44:57.169Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-486] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE192A01025
2026-06-14T06:44:57.457Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-503] c.v.f.controller.FundamentalController   : Request received for ISIN: INE093I01010
2026-06-14T06:44:57.461Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-503] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE093I01010...
2026-06-14T06:44:57.494Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-503] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE093I01010
2026-06-14T06:44:57.598Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-505] c.v.f.controller.FundamentalController   : Request received for ISIN: INE073K01018
2026-06-14T06:44:57.602Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-505] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE073K01018...
2026-06-14T06:44:59.057Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-506] c.v.f.controller.FundamentalController   : Request received for ISIN: INE006I01046
2026-06-14T06:44:59.062Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-506] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE006I01046...
2026-06-14T06:44:59.997Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-507] c.v.f.controller.FundamentalController   : Request received for ISIN: INE849A01020
2026-06-14T06:45:00.014Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-507] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE849A01020...
2026-06-14T06:45:00.978Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-508] c.v.f.controller.FundamentalController   : Request received for ISIN: INE669C01036
2026-06-14T06:45:00.984Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-509] c.v.f.controller.FundamentalController   : Request received for ISIN: INE216A01030
2026-06-14T06:45:00.986Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-508] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE669C01036...
2026-06-14T06:45:01.055Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-509] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE216A01030...
2026-06-14T06:45:01.119Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-510] c.v.f.controller.FundamentalController   : Request received for ISIN: INE111A01025
2026-06-14T06:45:01.120Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-510] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE111A01025...
2026-06-14T06:45:01.120Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-506] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE006I01046
2026-06-14T06:45:01.127Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-500] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE726G01019
2026-06-14T06:45:01.471Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-508] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE669C01036
2026-06-14T06:45:01.672Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-510] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE111A01025
2026-06-14T06:45:01.749Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-509] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE216A01030
2026-06-14T06:45:01.794Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-515] c.v.f.controller.FundamentalController   : Request received for ISIN: INE062A01020
2026-06-14T06:45:01.794Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-485] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE123W01016
2026-06-14T06:45:01.795Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-515] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE062A01020...
2026-06-14T06:45:01.797Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-517] c.v.f.controller.FundamentalController   : Request received for ISIN: INE081A01020
2026-06-14T06:45:01.800Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-517] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE081A01020...
2026-06-14T06:45:01.823Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-505] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE073K01018
2026-06-14T06:45:01.920Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-520] c.v.f.controller.FundamentalController   : Request received for ISIN: INE075A01022
2026-06-14T06:45:01.921Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-520] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE075A01022...
2026-06-14T06:45:01.958Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-521] c.v.f.controller.FundamentalController   : Request received for ISIN: INE498L01015
2026-06-14T06:45:01.959Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-521] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE498L01015...
2026-06-14T06:45:01.961Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-517] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE081A01020
2026-06-14T06:45:02.094Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-523] c.v.f.controller.FundamentalController   : Request received for ISIN: INE377N01017
2026-06-14T06:45:02.094Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-523] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE377N01017...
2026-06-14T06:45:02.110Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-520] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE075A01022
2026-06-14T06:45:02.159Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-524] c.v.f.controller.FundamentalController   : Request received for ISIN: INE484J01027
2026-06-14T06:45:02.159Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-524] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE484J01027...
2026-06-14T06:45:02.618Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-484] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE405E01023
2026-06-14T06:45:02.682Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-523] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE377N01017
2026-06-14T06:45:02.683Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-521] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE498L01015
2026-06-14T06:45:02.919Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-530] c.v.f.controller.FundamentalController   : Request received for ISIN: INE027H01010
2026-06-14T06:45:02.919Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-527] c.v.f.controller.FundamentalController   : Request received for ISIN: INE205A01025
2026-06-14T06:45:02.920Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-530] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE027H01010...
2026-06-14T06:45:02.921Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-527] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE205A01025...
2026-06-14T06:45:02.950Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-515] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE062A01020
2026-06-14T06:45:02.961Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-531] c.v.f.controller.FundamentalController   : Request received for ISIN: INE298J01013
2026-06-14T06:45:02.963Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-531] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE298J01013...
2026-06-14T06:45:03.039Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-507] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE849A01020
2026-06-14T06:45:03.122Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-524] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE484J01027
2026-06-14T06:45:03.142Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-527] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE205A01025
2026-06-14T06:45:03.151Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-534] c.v.f.controller.FundamentalController   : Request received for ISIN: INE121A01024
2026-06-14T06:45:03.156Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-534] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE121A01024...
2026-06-14T06:45:03.189Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-537] c.v.f.controller.FundamentalController   : Request received for ISIN: INE974X01010
2026-06-14T06:45:03.192Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-537] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE974X01010...
2026-06-14T06:45:03.197Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-538] c.v.f.controller.FundamentalController   : Request received for ISIN: INE854D01024
2026-06-14T06:45:03.198Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-538] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE854D01024...
2026-06-14T06:45:03.237Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-538] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE854D01024
2026-06-14T06:45:03.257Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-539] c.v.f.controller.FundamentalController   : Request received for ISIN: INE742F01042
2026-06-14T06:45:03.258Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-539] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE742F01042...
2026-06-14T06:45:03.603Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-541] c.v.f.controller.FundamentalController   : Request received for ISIN: INE226A01021
2026-06-14T06:45:03.603Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-541] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE226A01021...
2026-06-14T06:45:03.748Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-542] c.v.f.controller.FundamentalController   : Request received for ISIN: INE047A01021
2026-06-14T06:45:03.750Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-542] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE047A01021...
2026-06-14T06:45:03.761Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-530] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE027H01010
2026-06-14T06:45:03.788Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-539] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE742F01042
2026-06-14T06:45:03.835Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-545] c.v.f.controller.FundamentalController   : Request received for ISIN: INE326A01037
2026-06-14T06:45:03.837Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-545] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE326A01037...
2026-06-14T06:45:03.848Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-531] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE298J01013
2026-06-14T06:45:03.891Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-546] c.v.f.controller.FundamentalController   : Request received for ISIN: INE584A01023
2026-06-14T06:45:03.892Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-546] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE584A01023...
2026-06-14T06:45:03.896Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-541] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE226A01021
2026-06-14T06:45:03.912Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-548] c.v.f.controller.FundamentalController   : Request received for ISIN: INE414G01012
2026-06-14T06:45:03.913Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-548] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE414G01012...
2026-06-14T06:45:03.981Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-550] c.v.f.controller.FundamentalController   : Request received for ISIN: INE669E01016
2026-06-14T06:45:03.986Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-550] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE669E01016...
2026-06-14T06:45:04.534Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-546] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE584A01023
2026-06-14T06:45:04.645Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-552] c.v.f.controller.FundamentalController   : Request received for ISIN: INE211B01039
2026-06-14T06:45:04.646Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-552] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE211B01039...
2026-06-14T06:45:04.706Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-548] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE414G01012
2026-06-14T06:45:05.259Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-545] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE326A01037
2026-06-14T06:45:05.630Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-552] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE211B01039
2026-06-14T06:45:05.769Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-556] c.v.f.controller.FundamentalController   : Request received for ISIN: INE066P01011
2026-06-14T06:45:05.770Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-556] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE066P01011...
2026-06-14T06:45:05.868Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-557] c.v.f.controller.FundamentalController   : Request received for ISIN: INE213A01029
2026-06-14T06:45:05.868Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-557] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE213A01029...
2026-06-14T06:45:06.288Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-558] c.v.f.controller.FundamentalController   : Request received for ISIN: INE931S01010
2026-06-14T06:45:06.288Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-558] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE931S01010...
2026-06-14T06:45:06.315Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-534] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE121A01024
2026-06-14T06:45:06.345Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-550] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE669E01016
2026-06-14T06:45:06.739Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-556] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE066P01011
2026-06-14T06:45:06.801Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-562] c.v.f.controller.FundamentalController   : Request received for ISIN: INE704P01025
2026-06-14T06:45:06.802Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-562] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE704P01025...
2026-06-14T06:45:07.361Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-542] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE047A01021
2026-06-14T06:45:07.368Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-558] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE931S01010
2026-06-14T06:45:07.387Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-563] c.v.f.controller.FundamentalController   : Request received for ISIN: INE053F01010
2026-06-14T06:45:07.396Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-563] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE053F01010...
2026-06-14T06:45:07.433Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-566] c.v.f.controller.FundamentalController   : Request received for ISIN: INE127D01025
2026-06-14T06:45:07.434Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-566] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE127D01025...
2026-06-14T06:45:07.485Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-557] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE213A01029
2026-06-14T06:45:07.488Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-567] c.v.f.controller.FundamentalController   : Request received for ISIN: INE021A01026
2026-06-14T06:45:07.489Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-567] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE021A01026...
2026-06-14T06:45:08.078Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-569] c.v.f.controller.FundamentalController   : Request received for ISIN: INE356A01018
2026-06-14T06:45:08.078Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-569] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE356A01018...
2026-06-14T06:45:08.330Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-570] c.v.f.controller.FundamentalController   : Request received for ISIN: INE733E01010
2026-06-14T06:45:08.330Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-570] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE733E01010...
2026-06-14T06:45:08.338Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-571] c.v.f.controller.FundamentalController   : Request received for ISIN: INE022Q01020
2026-06-14T06:45:08.339Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-571] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE022Q01020...
2026-06-14T06:45:08.354Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-537] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE974X01010
2026-06-14T06:45:08.555Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-563] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE053F01010
2026-06-14T06:45:08.798Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-566] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE127D01025
2026-06-14T06:45:08.846Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-575] c.v.f.controller.FundamentalController   : Request received for ISIN: INE115A01026
2026-06-14T06:45:08.847Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-575] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE115A01026...
2026-06-14T06:45:08.850Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-571] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE022Q01020
2026-06-14T06:45:08.854Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-567] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE021A01026
2026-06-14T06:45:08.944Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-569] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE356A01018
2026-06-14T06:45:08.970Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-570] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE733E01010
2026-06-14T06:45:08.991Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-579] c.v.f.controller.FundamentalController   : Request received for ISIN: INE596I01020
2026-06-14T06:45:08.994Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-579] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE596I01020...
2026-06-14T06:45:09.018Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-581] c.v.f.controller.FundamentalController   : Request received for ISIN: INE702C01027
2026-06-14T06:45:09.021Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-581] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE702C01027...
2026-06-14T06:45:09.033Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-582] c.v.f.controller.FundamentalController   : Request received for ISIN: INE388Y01029
2026-06-14T06:45:09.035Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-582] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE388Y01029...
2026-06-14T06:45:09.040Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-582] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE388Y01029
2026-06-14T06:45:09.049Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-575] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE115A01026
2026-06-14T06:45:09.066Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-584] c.v.f.controller.FundamentalController   : Request received for ISIN: INE117A01022
2026-06-14T06:45:09.073Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-584] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE117A01022...
2026-06-14T06:45:09.082Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-586] c.v.f.controller.FundamentalController   : Request received for ISIN: INE239A01024
2026-06-14T06:45:09.084Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-586] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE239A01024...
2026-06-14T06:45:09.084Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-584] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE117A01022
2026-06-14T06:45:09.096Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-586] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE239A01024
2026-06-14T06:45:09.102Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-562] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE704P01025
2026-06-14T06:45:09.111Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-581] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE702C01027
2026-06-14T06:45:09.113Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-588] c.v.f.controller.FundamentalController   : Request received for ISIN: INE437A01024
2026-06-14T06:45:09.117Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-588] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE437A01024...
2026-06-14T06:45:09.118Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-589] c.v.f.controller.FundamentalController   : Request received for ISIN: INE245A01021
2026-06-14T06:45:09.119Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-589] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE245A01021...
2026-06-14T06:45:09.129Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-588] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE437A01024
2026-06-14T06:45:09.132Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-591] c.v.f.controller.FundamentalController   : Request received for ISIN: INE053A01029
2026-06-14T06:45:09.133Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-591] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE053A01029...
2026-06-14T06:45:09.134Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-592] c.v.f.controller.FundamentalController   : Request received for ISIN: INE196A01026
2026-06-14T06:45:09.135Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-592] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE196A01026...
2026-06-14T06:45:09.152Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-592] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE196A01026
2026-06-14T06:45:09.158Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-589] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE245A01021
2026-06-14T06:45:09.159Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-591] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE053A01029
2026-06-14T06:45:09.167Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-596] c.v.f.controller.FundamentalController   : Request received for ISIN: INE121J01017
2026-06-14T06:45:09.168Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-596] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE121J01017...
2026-06-14T06:45:09.169Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-597] c.v.f.controller.FundamentalController   : Request received for ISIN: INE121E01018
2026-06-14T06:45:09.172Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-597] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE121E01018...
2026-06-14T06:45:09.177Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-596] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE121J01017
2026-06-14T06:45:09.178Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-598] c.v.f.controller.FundamentalController   : Request received for ISIN: INE019A01038
2026-06-14T06:45:09.179Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-598] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE019A01038...
2026-06-14T06:45:09.181Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-597] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE121E01018
2026-06-14T06:45:09.187Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-598] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE019A01038
2026-06-14T06:45:09.188Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-599] c.v.f.controller.FundamentalController   : Request received for ISIN: INE522F01014
2026-06-14T06:45:09.188Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-599] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE522F01014...
2026-06-14T06:45:09.194Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-600] c.v.f.controller.FundamentalController   : Request received for ISIN: INE296A01032
2026-06-14T06:45:09.194Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-600] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE296A01032...
2026-06-14T06:45:09.198Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-599] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE522F01014
2026-06-14T06:45:09.205Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-601] c.v.f.controller.FundamentalController   : Request received for ISIN: INE095N01031
2026-06-14T06:45:09.206Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-601] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE095N01031...
2026-06-14T06:45:09.210Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-600] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE296A01032
2026-06-14T06:45:09.219Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-601] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE095N01031
2026-06-14T06:45:09.442Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-608] c.v.f.controller.FundamentalController   : Request received for ISIN: INE066F01020
2026-06-14T06:45:09.446Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-608] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE066F01020...
2026-06-14T06:45:09.464Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-608] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE066F01020
2026-06-14T06:45:09.481Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-610] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-14T06:45:09.482Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-610] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE002A01018...
2026-06-14T06:45:09.485Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-612] c.v.f.controller.FundamentalController   : Request received for ISIN: INE0J1Y01017
2026-06-14T06:45:09.489Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-612] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE0J1Y01017...
2026-06-14T06:45:09.491Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-610] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE002A01018
2026-06-14T06:45:09.498Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-614] c.v.f.controller.FundamentalController   : Request received for ISIN: INE079A01024
2026-06-14T06:45:09.500Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-614] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE079A01024...
2026-06-14T06:45:09.502Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-612] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE0J1Y01017
2026-06-14T06:45:09.506Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-615] c.v.f.controller.FundamentalController   : Request received for ISIN: INE467B01029
2026-06-14T06:45:09.507Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-615] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE467B01029...
2026-06-14T06:45:09.510Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-614] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE079A01024
2026-06-14T06:45:09.512Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-615] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE467B01029
2026-06-14T06:45:09.513Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-616] c.v.f.controller.FundamentalController   : Request received for ISIN: INE457L01029
2026-06-14T06:45:09.518Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-616] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE457L01029...
2026-06-14T06:45:09.526Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-618] c.v.f.controller.FundamentalController   : Request received for ISIN: INE260B01028
2026-06-14T06:45:09.530Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-618] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE260B01028...
2026-06-14T06:45:09.571Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-618] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE260B01028
2026-06-14T06:45:09.572Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-619] c.v.f.controller.FundamentalController   : Request received for ISIN: INE299U01018
2026-06-14T06:45:09.584Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-619] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE299U01018...
2026-06-14T06:45:09.610Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-621] c.v.f.controller.FundamentalController   : Request received for ISIN: INE040A01034
2026-06-14T06:45:09.617Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-621] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE040A01034...
2026-06-14T06:45:09.648Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-621] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE040A01034
2026-06-14T06:45:09.645Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-616] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE457L01029
2026-06-14T06:45:09.678Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-619] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE299U01018
2026-06-14T06:45:09.755Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-623] c.v.f.controller.FundamentalController   : Request received for ISIN: INE603J01030
2026-06-14T06:45:09.757Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-623] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE603J01030...
2026-06-14T06:45:09.800Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-624] c.v.f.controller.FundamentalController   : Request received for ISIN: INE200A01026
2026-06-14T06:45:09.814Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-624] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE200A01026...
2026-06-14T06:45:09.845Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-623] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE603J01030
2026-06-14T06:45:09.872Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-624] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE200A01026
2026-06-14T06:45:09.900Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-626] c.v.f.controller.FundamentalController   : Request received for ISIN: INE371P01015
2026-06-14T06:45:09.904Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-626] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE371P01015...
2026-06-14T06:45:09.974Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-626] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE371P01015
2026-06-14T06:45:10.579Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-632] c.v.f.controller.FundamentalController   : Request received for ISIN: INE202E01016
2026-06-14T06:45:10.584Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-632] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE202E01016...
2026-06-14T06:45:10.636Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-632] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE202E01016
2026-06-14T06:45:10.698Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-635] c.v.f.controller.FundamentalController   : Request received for ISIN: INE066A01021
2026-06-14T06:45:10.699Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-635] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE066A01021...
2026-06-14T06:45:10.715Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-635] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE066A01021
2026-06-14T06:45:10.741Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-637] c.v.f.controller.FundamentalController   : Request received for ISIN: INE663F01032
2026-06-14T06:45:10.742Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-637] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE663F01032...
2026-06-14T06:45:10.763Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-637] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE663F01032
2026-06-14T06:45:10.791Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-579] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE596I01020
2026-06-14T06:45:10.815Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-638] c.v.f.controller.FundamentalController   : Request received for ISIN: INE752E01010
2026-06-14T06:45:10.816Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-638] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE752E01010...
2026-06-14T06:45:10.848Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-638] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE752E01010
2026-06-14T06:45:10.921Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-639] c.v.f.controller.FundamentalController   : Request received for ISIN: INE318A01026
2026-06-14T06:45:10.922Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-639] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE318A01026...
2026-06-14T06:45:10.942Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-639] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE318A01026
2026-06-14T06:45:11.155Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-641] c.v.f.controller.FundamentalController   : Request received for ISIN: INE947Q01028
2026-06-14T06:45:11.158Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-641] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE947Q01028...
2026-06-14T06:45:11.186Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-641] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE947Q01028
2026-06-14T06:45:11.192Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-642] c.v.f.controller.FundamentalController   : Request received for ISIN: INE918I01026
2026-06-14T06:45:11.194Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-642] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE918I01026...
2026-06-14T06:45:11.214Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-642] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE918I01026
2026-06-14T06:45:11.732Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-645] c.v.f.controller.FundamentalController   : Request received for ISIN: INE271C01023
2026-06-14T06:45:11.736Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-645] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE271C01023...
2026-06-14T06:45:11.763Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-645] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE271C01023
2026-06-14T06:45:12.142Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-648] c.v.f.controller.FundamentalController   : Request received for ISIN: INE848E01016
2026-06-14T06:45:12.146Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-648] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE848E01016...
2026-06-14T06:45:12.176Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-648] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE848E01016
2026-06-14T06:45:12.210Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-649] c.v.f.controller.FundamentalController   : Request received for ISIN: INE982J01020
2026-06-14T06:45:12.211Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-649] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE982J01020...
2026-06-14T06:45:12.241Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-649] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE982J01020
2026-06-14T06:45:12.297Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-650] c.v.f.controller.FundamentalController   : Request received for ISIN: INE089A01031
2026-06-14T06:45:12.299Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-650] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE089A01031...
2026-06-14T06:45:12.323Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-650] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE089A01031
2026-06-14T06:45:12.368Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-651] c.v.f.controller.FundamentalController   : Request received for ISIN: INE758E01017
2026-06-14T06:45:12.370Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-651] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE758E01017...
2026-06-14T06:45:12.398Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-651] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE758E01017
2026-06-14T06:45:12.869Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-654] c.v.f.controller.FundamentalController   : Request received for ISIN: INE761H01022
2026-06-14T06:45:12.872Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-654] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE761H01022...
2026-06-14T06:45:12.894Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-654] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE761H01022
2026-06-14T06:45:12.931Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-655] c.v.f.controller.FundamentalController   : Request received for ISIN: INE451A01017
2026-06-14T06:45:12.932Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-655] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE451A01017...
2026-06-14T06:45:12.954Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-655] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE451A01017
2026-06-14T06:45:13.849Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-657] c.v.f.controller.FundamentalController   : Request received for ISIN: INE646L01027
2026-06-14T06:45:13.850Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-657] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE646L01027...
2026-06-14T06:45:13.867Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-657] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE646L01027
2026-06-14T06:45:14.216Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-661] c.v.f.controller.FundamentalController   : Request received for ISIN: INE0V6F01027
2026-06-14T06:45:14.217Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-661] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE0V6F01027...
2026-06-14T06:45:14.233Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-661] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE0V6F01027
2026-06-14T06:45:14.268Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-662] c.v.f.controller.FundamentalController   : Request received for ISIN: INE494B01023
2026-06-14T06:45:14.270Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-662] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE494B01023...
2026-06-14T06:45:14.281Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-662] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE494B01023
2026-06-14T06:45:14.295Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-663] c.v.f.controller.FundamentalController   : Request received for ISIN: INE010B01027
2026-06-14T06:45:14.295Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-663] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE010B01027...
2026-06-14T06:45:14.296Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-664] c.v.f.controller.FundamentalController   : Request received for ISIN: INE302A01020
2026-06-14T06:45:14.297Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-664] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE302A01020...
2026-06-14T06:45:14.323Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-664] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE302A01020
2026-06-14T06:45:14.325Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-663] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE010B01027
2026-06-14T06:45:14.355Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-670] c.v.f.controller.FundamentalController   : Request received for ISIN: INE634S01028
2026-06-14T06:45:14.356Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-670] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE634S01028...
2026-06-14T06:45:14.377Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-670] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE634S01028
2026-06-14T06:45:14.419Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-672] c.v.f.controller.FundamentalController   : Request received for ISIN: INE059A01026
2026-06-14T06:45:14.420Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-672] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE059A01026...
2026-06-14T06:45:14.424Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-673] c.v.f.controller.FundamentalController   : Request received for ISIN: INE397D01024
2026-06-14T06:45:14.425Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-673] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE397D01024...
2026-06-14T06:45:14.427Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-676] c.v.f.controller.FundamentalController   : Request received for ISIN: INE138Y01010
2026-06-14T06:45:14.427Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-676] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE138Y01010...
2026-06-14T06:45:14.434Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-672] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE059A01026
2026-06-14T06:45:14.444Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-676] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE138Y01010
2026-06-14T06:45:14.449Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-673] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE397D01024
2026-06-14T06:45:14.451Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-678] c.v.f.controller.FundamentalController   : Request received for ISIN: INE732I01021
2026-06-14T06:45:14.454Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-678] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE732I01021...
2026-06-14T06:45:14.453Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-680] c.v.f.controller.FundamentalController   : Request received for ISIN: INE797F01020
2026-06-14T06:45:14.452Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-679] c.v.f.controller.FundamentalController   : Request received for ISIN: INE192R01011
2026-06-14T06:45:14.458Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-680] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE797F01020...
2026-06-14T06:45:14.459Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-679] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE192R01011...
2026-06-14T06:45:14.472Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-680] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE797F01020
2026-06-14T06:45:14.473Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-678] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE732I01021
2026-06-14T06:45:14.474Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-679] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE192R01011
2026-06-14T06:45:14.477Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-682] c.v.f.controller.FundamentalController   : Request received for ISIN: INE949L01017
2026-06-14T06:45:14.477Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-682] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE949L01017...
2026-06-14T06:45:14.492Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-683] c.v.f.controller.FundamentalController   : Request received for ISIN: INE180A01020
2026-06-14T06:45:14.492Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-683] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE180A01020...
2026-06-14T06:45:14.493Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-682] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE949L01017
2026-06-14T06:45:14.500Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-683] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE180A01020
2026-06-14T06:45:14.524Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-685] c.v.f.controller.FundamentalController   : Request received for ISIN: INE795G01014
2026-06-14T06:45:14.525Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-685] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE795G01014...
2026-06-14T06:45:14.527Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-686] c.v.f.controller.FundamentalController   : Request received for ISIN: INE881D01027
2026-06-14T06:45:14.527Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-686] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE881D01027...
2026-06-14T06:45:14.536Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-685] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE795G01014
2026-06-14T06:45:14.541Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-686] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE881D01027
2026-06-14T06:45:14.591Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-693] c.v.f.controller.FundamentalController   : Request received for ISIN: INE148I01020
2026-06-14T06:45:14.591Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-693] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE148I01020...
2026-06-14T06:45:14.600Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-693] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE148I01020
2026-06-14T06:45:14.600Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-695] c.v.f.controller.FundamentalController   : Request received for ISIN: INE280A01028
2026-06-14T06:45:14.602Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-695] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE280A01028...
2026-06-14T06:45:14.610Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-695] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE280A01028
2026-06-14T06:45:14.628Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-698] c.v.f.controller.FundamentalController   : Request received for ISIN: INE155A01022
2026-06-14T06:45:14.628Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-698] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE155A01022...
2026-06-14T06:45:14.633Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-699] c.v.f.controller.FundamentalController   : Request received for ISIN: INE572E01012
2026-06-14T06:45:14.633Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-699] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE572E01012...
2026-06-14T06:45:14.638Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-701] c.v.f.controller.FundamentalController   : Request received for ISIN: INE274J01014
2026-06-14T06:45:14.639Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-700] c.v.f.controller.FundamentalController   : Request received for ISIN: INE298A01020
2026-06-14T06:45:14.640Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-700] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE298A01020...
2026-06-14T06:45:14.640Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-701] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE274J01014...
2026-06-14T06:45:14.645Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-700] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE298A01020
2026-06-14T06:45:14.646Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-701] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE274J01014
2026-06-14T06:45:14.647Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-698] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE155A01022
2026-06-14T06:45:14.648Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-699] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE572E01012
2026-06-14T06:45:14.653Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-702] c.v.f.controller.FundamentalController   : Request received for ISIN: INE095A01012
2026-06-14T06:45:14.654Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-702] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE095A01012...
2026-06-14T06:45:14.660Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-703] c.v.f.controller.FundamentalController   : Request received for ISIN: INE944F01028
2026-06-14T06:45:14.660Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-703] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE944F01028...
2026-06-14T06:45:14.663Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-702] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE095A01012
2026-06-14T06:45:14.667Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-703] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE944F01028
2026-06-14T06:45:14.712Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-705] c.v.f.controller.FundamentalController   : Request received for ISIN: INE195A01028
2026-06-14T06:45:14.713Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-705] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE195A01028...
2026-06-14T06:45:14.718Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-706] c.v.f.controller.FundamentalController   : Request received for ISIN: INE562A01011
2026-06-14T06:45:14.719Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-706] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE562A01011...
2026-06-14T06:45:14.723Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-705] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE195A01028
2026-06-14T06:45:14.732Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-706] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE562A01011
2026-06-14T06:45:14.778Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-712] c.v.f.controller.FundamentalController   : Request received for ISIN: INE118H01025
2026-06-14T06:45:14.778Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-712] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE118H01025...
2026-06-14T06:45:14.788Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-712] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE118H01025
2026-06-14T06:45:14.846Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-716] c.v.f.controller.FundamentalController   : Request received for ISIN: INE364U01010
2026-06-14T06:45:14.847Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-716] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE364U01010...
2026-06-14T06:45:14.857Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-716] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE364U01010
2026-06-14T06:45:14.883Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-718] c.v.f.controller.FundamentalController   : Request received for ISIN: INE238A01034
2026-06-14T06:45:14.884Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-718] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE238A01034...
2026-06-14T06:45:14.895Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-719] c.v.f.controller.FundamentalController   : Request received for ISIN: INE935N01020
2026-06-14T06:45:14.899Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-718] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE238A01034
2026-06-14T06:45:14.901Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-719] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE935N01020...
2026-06-14T06:45:14.911Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-720] c.v.f.controller.FundamentalController   : Request received for ISIN: INE338I01027
2026-06-14T06:45:14.914Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-721] c.v.f.controller.FundamentalController   : Request received for ISIN: INE242A01010
2026-06-14T06:45:14.915Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-720] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE338I01027...
2026-06-14T06:45:14.915Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-721] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE242A01010...
2026-06-14T06:45:14.915Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-719] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE935N01020
2026-06-14T06:45:14.924Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-721] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE242A01010
2026-06-14T06:45:14.931Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-720] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE338I01027
2026-06-14T06:45:14.942Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-722] c.v.f.controller.FundamentalController   : Request received for ISIN: INE038A01020
2026-06-14T06:45:14.942Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-722] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE038A01020...
2026-06-14T06:45:14.948Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-723] c.v.f.controller.FundamentalController   : Request received for ISIN: INE044A01036
2026-06-14T06:45:14.952Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-723] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE044A01036...
2026-06-14T06:45:14.957Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-722] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE038A01020
2026-06-14T06:45:14.964Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-723] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE044A01036
2026-06-14T06:45:14.987Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-726] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T06:45:14.988Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-726] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T06:45:14.995Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-726] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE692A01016
2026-06-14T06:45:15.084Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-728] c.v.f.controller.FundamentalController   : Request received for ISIN: INE04I401011
2026-06-14T06:45:15.085Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-728] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE04I401011...
2026-06-14T06:45:15.146Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-728] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE04I401011
2026-06-14T06:45:15.175Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-731] c.v.f.controller.FundamentalController   : Request received for ISIN: INE061F01013
2026-06-14T06:45:15.184Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-732] c.v.f.controller.FundamentalController   : Request received for ISIN: INE685A01028
2026-06-14T06:45:15.187Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-732] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE685A01028...
2026-06-14T06:45:15.183Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-731] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE061F01013...
2026-06-14T06:45:15.210Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-734] c.v.f.controller.FundamentalController   : Request received for ISIN: INE263A01024
2026-06-14T06:45:15.211Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-734] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE263A01024...
2026-06-14T06:45:15.219Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-732] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE685A01028
2026-06-14T06:45:15.225Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-734] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE263A01024
2026-06-14T06:45:15.229Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-731] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE061F01013
2026-06-14T06:45:15.312Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-737] c.v.f.controller.FundamentalController   : Request received for ISIN: INE020B01018
2026-06-14T06:45:15.313Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-737] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE020B01018...
2026-06-14T06:45:15.322Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-739] c.v.f.controller.FundamentalController   : Request received for ISIN: INE0BS701011
2026-06-14T06:45:15.323Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-739] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE0BS701011...
2026-06-14T06:45:15.334Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-740] c.v.f.controller.FundamentalController   : Request received for ISIN: INE860A01027
2026-06-14T06:45:15.336Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-740] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE860A01027...
2026-06-14T06:45:15.341Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-737] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE020B01018
2026-06-14T06:45:15.344Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-741] c.v.f.controller.FundamentalController   : Request received for ISIN: INE647A01010
2026-06-14T06:45:15.341Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-739] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE0BS701011
2026-06-14T06:45:15.348Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-741] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE647A01010...
2026-06-14T06:45:15.355Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-740] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE860A01027
2026-06-14T06:45:15.366Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-741] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE647A01010
2026-06-14T06:45:15.379Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-743] c.v.f.controller.FundamentalController   : Request received for ISIN: INE00H001014
2026-06-14T06:45:15.379Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-743] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE00H001014...
2026-06-14T06:45:15.392Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-743] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE00H001014
2026-06-14T06:45:15.461Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-747] c.v.f.controller.FundamentalController   : Request received for ISIN: INE171A01029
2026-06-14T06:45:15.462Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-747] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE171A01029...
2026-06-14T06:45:15.472Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-748] c.v.f.controller.FundamentalController   : Request received for ISIN: INE976G01028
2026-06-14T06:45:15.473Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-748] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE976G01028...
2026-06-14T06:45:15.475Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-747] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE171A01029
2026-06-14T06:45:15.496Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-748] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE976G01028
2026-06-14T06:45:15.514Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-749] c.v.f.controller.FundamentalController   : Request received for ISIN: INE262H01021
2026-06-14T06:45:15.514Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-749] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE262H01021...
2026-06-14T06:45:15.515Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-751] c.v.f.controller.FundamentalController   : Request received for ISIN: INE084A01016
2026-06-14T06:45:15.516Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-751] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE084A01016...
2026-06-14T06:45:15.522Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-751] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE084A01016
2026-06-14T06:45:15.523Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-749] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE262H01021
2026-06-14T06:45:15.899Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-756] c.v.f.controller.FundamentalController   : Request received for ISIN: INE775A01035
2026-06-14T06:45:15.900Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-756] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE775A01035...
2026-06-14T06:45:15.927Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-756] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE775A01035
2026-06-14T06:45:15.931Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-757] c.v.f.controller.FundamentalController   : Request received for ISIN: INE878B01027
2026-06-14T06:45:15.935Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-757] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE878B01027...
2026-06-14T06:45:15.971Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-757] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE878B01027
2026-06-14T06:45:15.981Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-759] c.v.f.controller.FundamentalController   : Request received for ISIN: INE776C01039
2026-06-14T06:45:15.982Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-759] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE776C01039...
2026-06-14T06:45:15.992Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-759] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE776C01039
2026-06-14T06:45:16.002Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-760] c.v.f.controller.FundamentalController   : Request received for ISIN: INE018E01016
2026-06-14T06:45:16.003Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-760] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE018E01016...
2026-06-14T06:45:16.014Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-760] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE018E01016
2026-06-14T06:45:16.893Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-764] c.v.f.controller.FundamentalController   : Request received for ISIN: INE417T01026
2026-06-14T06:45:16.896Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-764] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE417T01026...
2026-06-14T06:45:16.921Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-765] c.v.f.controller.FundamentalController   : Request received for ISIN: INE415G01027
2026-06-14T06:45:16.922Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-765] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE415G01027...
2026-06-14T06:45:16.924Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-764] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE417T01026
2026-06-14T06:45:16.942Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-765] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE415G01027
2026-06-14T06:45:17.283Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-767] c.v.f.controller.FundamentalController   : Request received for ISIN: INE176B01034
2026-06-14T06:45:17.284Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-767] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE176B01034...
2026-06-14T06:45:17.316Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-767] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE176B01034
2026-06-14T06:45:17.451Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-768] c.v.f.controller.FundamentalController   : Request received for ISIN: INE214T01019
2026-06-14T06:45:17.454Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-768] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE214T01019...
2026-06-14T06:45:17.485Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-768] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE214T01019
2026-06-14T06:45:17.732Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-770] c.v.f.controller.FundamentalController   : Request received for ISIN: INE323A01026
2026-06-14T06:45:17.735Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-770] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE323A01026...
2026-06-14T06:45:17.738Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-771] c.v.f.controller.FundamentalController   : Request received for ISIN: INE545U01014
2026-06-14T06:45:17.745Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-771] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE545U01014...
2026-06-14T06:45:17.772Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-770] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE323A01026
2026-06-14T06:45:17.786Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-771] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE545U01014
2026-06-14T06:45:18.370Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-775] c.v.f.controller.FundamentalController   : Request received for ISIN: INE249Z01020
2026-06-14T06:45:18.372Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-775] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE249Z01020...
2026-06-14T06:45:18.417Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-775] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE249Z01020
2026-06-14T06:45:18.829Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-778] c.v.f.controller.FundamentalController   : Request received for ISIN: INE758T01015
2026-06-14T06:45:18.832Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-778] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE758T01015...
2026-06-14T06:45:18.875Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-778] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE758T01015
2026-06-14T06:45:19.075Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-779] c.v.f.controller.FundamentalController   : Request received for ISIN: INE154A01025
2026-06-14T06:45:19.076Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-779] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE154A01025...
2026-06-14T06:45:19.114Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-779] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE154A01025
2026-06-14T06:45:19.341Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-781] c.v.f.controller.FundamentalController   : Request received for ISIN: INE101A01026
2026-06-14T06:45:19.344Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-781] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE101A01026...
2026-06-14T06:45:19.347Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-782] c.v.f.controller.FundamentalController   : Request received for ISIN: INE406A01037
2026-06-14T06:45:19.349Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-782] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE406A01037...
2026-06-14T06:45:19.399Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-782] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE406A01037
2026-06-14T06:45:19.408Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-781] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE101A01026
2026-06-14T06:45:19.672Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-784] c.v.f.controller.FundamentalController   : Request received for ISIN: INE343H01029
2026-06-14T06:45:19.675Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-784] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE343H01029...
2026-06-14T06:45:19.715Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-784] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE343H01029
2026-06-14T06:45:20.510Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-788] c.v.f.controller.FundamentalController   : Request received for ISIN: INE148O01028
2026-06-14T06:45:20.513Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-788] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE148O01028...
2026-06-14T06:45:20.548Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-788] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE148O01028
2026-06-14T06:45:20.941Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-791] c.v.f.controller.FundamentalController   : Request received for ISIN: INE303R01014
2026-06-14T06:45:20.945Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-791] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE303R01014...
2026-06-14T06:45:20.970Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-791] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE303R01014
2026-06-14T06:45:21.056Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-792] c.v.f.controller.FundamentalController   : Request received for ISIN: INE208A01029
2026-06-14T06:45:21.057Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-792] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE208A01029...
2026-06-14T06:45:21.093Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-792] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE208A01029
2026-06-14T06:45:21.140Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-793] c.v.f.controller.FundamentalController   : Request received for ISIN: INE090A01021
2026-06-14T06:45:21.141Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-793] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE090A01021...
2026-06-14T06:45:21.158Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-793] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE090A01021
2026-06-14T06:45:21.569Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-795] c.v.f.controller.FundamentalController   : Request received for ISIN: INE040H01021
2026-06-14T06:45:21.571Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-795] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE040H01021...
2026-06-14T06:45:21.605Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-795] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE040H01021
2026-06-14T06:45:21.618Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-796] c.v.f.controller.FundamentalController   : Request received for ISIN: INE455K01017
2026-06-14T06:45:21.620Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-796] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE455K01017...
2026-06-14T06:45:21.639Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-796] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE455K01017
2026-06-14T06:45:22.405Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-801] c.v.f.controller.FundamentalController   : Request received for ISIN: INE347G01014
2026-06-14T06:45:22.409Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-801] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE347G01014...
2026-06-14T06:45:22.416Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-803] c.v.f.controller.FundamentalController   : Request received for ISIN: INE018A01030
2026-06-14T06:45:22.424Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-803] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE018A01030...
2026-06-14T06:45:22.461Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-801] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE347G01014
2026-06-14T06:45:22.479Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-803] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE018A01030
2026-06-14T06:45:22.858Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-805] c.v.f.controller.FundamentalController   : Request received for ISIN: INE067A01029
2026-06-14T06:45:22.860Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-805] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE067A01029...
2026-06-14T06:45:22.889Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-805] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE067A01029
2026-06-14T06:45:22.901Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-806] c.v.f.controller.FundamentalController   : Request received for ISIN: INE423A01024
2026-06-14T06:45:22.903Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-806] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE423A01024...
2026-06-14T06:45:22.929Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-806] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE423A01024
2026-06-14T06:45:23.109Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-807] c.v.f.controller.FundamentalController   : Request received for ISIN: INE628A01036
2026-06-14T06:45:23.110Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-807] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE628A01036...
2026-06-14T06:45:23.116Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-808] c.v.f.controller.FundamentalController   : Request received for ISIN: INE092T01019
2026-06-14T06:45:23.119Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-808] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE092T01019...
2026-06-14T06:45:23.160Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-809] c.v.f.controller.FundamentalController   : Request received for ISIN: INE472A01039
2026-06-14T06:45:23.162Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-809] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE472A01039...
2026-06-14T06:45:23.162Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-808] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE092T01019
2026-06-14T06:45:23.191Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-807] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE628A01036
2026-06-14T06:45:23.210Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-809] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE472A01039
2026-06-14T06:45:23.740Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-811] c.v.f.controller.FundamentalController   : Request received for ISIN: INE259A01022
2026-06-14T06:45:23.742Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-811] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE259A01022...
2026-06-14T06:45:23.777Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-811] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE259A01022
2026-06-14T06:45:24.437Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-815] c.v.f.controller.FundamentalController   : Request received for ISIN: INE765G01017
2026-06-14T06:45:24.440Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-815] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE765G01017...
2026-06-14T06:45:24.490Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-815] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE765G01017
2026-06-14T06:45:24.544Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-816] c.v.f.controller.FundamentalController   : Request received for ISIN: INE07Y701011
2026-06-14T06:45:24.547Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-816] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE07Y701011...
2026-06-14T06:45:24.600Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-816] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE07Y701011
2026-06-14T06:45:24.771Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-818] c.v.f.controller.FundamentalController   : Request received for ISIN: INE129A01019
2026-06-14T06:45:24.772Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-818] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE129A01019...
2026-06-14T06:45:24.812Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-818] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE129A01019
2026-06-14T06:45:24.973Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-819] c.v.f.controller.FundamentalController   : Request received for ISIN: INE257A01026
2026-06-14T06:45:24.975Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-819] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE257A01026...
2026-06-14T06:45:25.026Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-819] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE257A01026
2026-06-14T06:45:25.384Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-820] c.v.f.controller.FundamentalController   : Request received for ISIN: INE481G01011
2026-06-14T06:45:25.386Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-820] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE481G01011...
2026-06-14T06:45:25.423Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-820] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE481G01011
2026-06-14T06:45:26.246Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-829] c.v.f.controller.FundamentalController   : Request received for ISIN: INE029A01011
2026-06-14T06:45:26.248Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-829] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE029A01011...
2026-06-14T06:45:26.284Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-829] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE029A01011
2026-06-14T06:45:26.398Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-830] c.v.f.controller.FundamentalController   : Request received for ISIN: INE200M01039
2026-06-14T06:45:26.402Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-830] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE200M01039...
2026-06-14T06:45:26.435Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-832] c.v.f.controller.FundamentalController   : Request received for ISIN: INE670A01012
2026-06-14T06:45:26.437Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-832] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE670A01012...
2026-06-14T06:45:26.460Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-830] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE200M01039
2026-06-14T06:45:26.467Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-832] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE670A01012
2026-06-14T06:45:26.477Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-833] c.v.f.controller.FundamentalController   : Request received for ISIN: INE114A01011
2026-06-14T06:45:26.478Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-833] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE114A01011...
2026-06-14T06:45:26.498Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-833] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE114A01011
2026-06-14T06:45:26.546Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-834] c.v.f.controller.FundamentalController   : Request received for ISIN: INE935A01035
2026-06-14T06:45:26.548Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-834] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE935A01035...
2026-06-14T06:45:26.579Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-834] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE935A01035
2026-06-14T06:45:27.056Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-837] c.v.f.controller.FundamentalController   : Request received for ISIN: INE003A01024
2026-06-14T06:45:27.058Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-837] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE003A01024...
2026-06-14T06:45:27.086Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-837] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE003A01024
2026-06-14T06:45:27.092Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-838] c.v.f.controller.FundamentalController   : Request received for ISIN: INE016A01026
2026-06-14T06:45:27.094Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-838] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE016A01026...
2026-06-14T06:45:27.129Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-838] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE016A01026
2026-06-14T06:49:29.082Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-844] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-14T06:49:29.085Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-844] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE002A01018...
2026-06-14T06:49:29.106Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-844] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE002A01018
2026-06-14T06:50:11.691Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-846] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T06:50:11.696Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-846] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T06:50:11.726Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-846] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE692A01016
2026-06-14T06:50:24.269Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-848] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T06:50:24.272Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-848] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T06:50:24.288Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-848] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE692A01016
2026-06-14T06:50:59.585Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-850] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T06:50:59.586Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-850] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T06:50:59.595Z  INFO 18421 --- [vega.fundamentals] [tomcat-handler-850] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE692A01016
2026-06-14T06:51:37.537Z  INFO 30320 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication using Java 21.0.10 with PID 30320 (/root/fundamentals/backend/target/classes started by root in /root/fundamentals/backend)
2026-06-14T06:51:37.540Z  INFO 30320 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-14T06:51:39.954Z  INFO 30320 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-14T06:51:39.975Z  INFO 30320 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-14T06:51:39.976Z  INFO 30320 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-14T06:51:40.129Z  INFO 30320 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-14T06:51:40.130Z  INFO 30320 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2487 ms
2026-06-14T06:51:40.290Z  INFO 30320 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-14T06:51:40.416Z  INFO 30320 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loading instruments from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T06:51:42.270Z  INFO 30320 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loaded 17996 instruments (ISINs: 17996, Keys: 139030) from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T06:51:42.271Z  INFO 30320 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Identified 211 F&O linked equities.
2026-06-14T06:51:43.216Z  INFO 30320 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-14T06:51:43.227Z  INFO 30320 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 6.855 seconds (process running for 7.689)
2026-06-14T06:51:45.871Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-14T06:51:45.872Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-14T06:51:45.874Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
2026-06-14T06:51:46.897Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T06:51:46.898Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T06:51:47.867Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE692A01016
2026-06-14T06:52:07.339Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T06:52:07.342Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T06:52:07.357Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE692A01016
2026-06-14T06:52:36.375Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T06:52:36.376Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T06:52:36.394Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.service.FundamentalCacheService    : History hit for ISIN: INE692A01016
2026-06-14T06:58:22.200Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.controller.FundamentalController   : Request received for ISIN: INE692A01016
2026-06-14T06:58:22.208Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE692A01016...
2026-06-14T06:58:22.210Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE692A01016
2026-06-14T06:58:27.255Z ERROR 30320 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching profile for ISIN: INE692A01016: null
2026-06-14T06:58:27.278Z ERROR 30320 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching balanceSheet for ISIN: INE692A01016: null
2026-06-14T06:58:27.283Z ERROR 30320 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching cashFlow for ISIN: INE692A01016: null
2026-06-14T06:58:27.288Z ERROR 30320 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching incomeStatement for ISIN: INE692A01016: null
2026-06-14T06:58:27.291Z ERROR 30320 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching shareHoldings for ISIN: INE692A01016: null
2026-06-14T06:58:27.292Z ERROR 30320 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching keyRatios for ISIN: INE692A01016: null
2026-06-14T06:58:27.293Z ERROR 30320 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching corporateActions for ISIN: INE692A01016: null
2026-06-14T06:58:27.293Z ERROR 30320 --- [vega.fundamentals] [CompletableFutureDelayScheduler] c.v.f.s.FundamentalAggregatorService     : Timeout or error fetching competitors for ISIN: INE692A01016: null
2026-06-14T06:58:27.340Z  INFO 30320 --- [vega.fundamentals] [tomcat-handler-5] c.v.f.service.FundamentalHistoryService  : metadata.json missing or corrupted for ISIN: INE692A01016. Rebuilding from history...
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
// File: src/main/java/com/vega/fundamentals/config/AsyncConfig.java
package com.vega.fundamentals.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class AsyncConfig {

    @Bean
    public ExecutorService virtualThreadExecutor() {
        return Executors.newVirtualThreadPerTaskExecutor();
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

import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Optional;

@RestController
@RequestMapping("/api/fundamentals")
@RequiredArgsConstructor
@Slf4j
@Validated
public class FundamentalController {

    private final FundamentalAggregatorService aggregatorService;
    private final FundamentalCacheService cacheService;
    private final com.vega.fundamentals.service.FundamentalHistoryService historyService;
    private final com.vega.fundamentals.service.FundamentalAnalyzer analyzer;
    private final com.vega.fundamentals.service.FundamentalBootstrapService bootstrapService;

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

        return ResponseEntity.ok(snapshot);
    }

    @GetMapping("/{isin}/history")
    public ResponseEntity<FundamentalSnapshot> getHistoricalFundamentals(
            @PathVariable 
            @Pattern(regexp = "^[A-Z]{2}[A-Z0-9]{9}[0-9]$", message = "Invalid ISIN format")
            String isin,
            @RequestParam(required = false) String timestamp) {
        
        log.info("Historical request received for ISIN: {} at {}", isin, timestamp);

        Instant asOf = null;
        if (timestamp != null) {
            try {
                asOf = Instant.parse(timestamp);
            } catch (Exception e) {
                // Try epoch millis if ISO format fails
                try {
                    asOf = Instant.ofEpochMilli(Long.parseLong(timestamp));
                } catch (Exception e2) {
                    return ResponseEntity.badRequest().build();
                }
            }
        }

        Optional<FundamentalSnapshot> snapshot = historyService.reconstructSnapshot(isin, asOf);
        if (snapshot.isPresent()) {
            FundamentalSnapshot s = snapshot.get();
            s.setAnalysis(analyzer.analyze(s));
            return ResponseEntity.ok(s);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/bootstrap/fno")
    public ResponseEntity<com.vega.fundamentals.service.FundamentalBootstrapService.BootstrapResult> bootstrapFno() {
        log.info("F&O Bootstrap trigger received.");
        return ResponseEntity.ok(bootstrapService.bootstrapFno());
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
    private String analysisVersion;

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
    private Instant firstSeenTs;
    private Instant lastUpdatedTs;

    @Builder.Default
    private Map<String, EndpointMetadata> endpoints = new HashMap<>();

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EndpointMetadata {
        private long version;
        private String hash;
        private Instant lastUpdatedTs;
        private long offset;
    }
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

import com.fasterxml.jackson.core.type.TypeReference;
import com.vega.fundamentals.dto.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum FundamentalEndpoint {
    PROFILE("profile", "profile.jsonl", new TypeReference<CompanyProfileDto>() {}),
    BALANCE_SHEET("balanceSheet", "balanceSheet.jsonl", new TypeReference<BalanceSheetContainer>() {}),
    CASH_FLOW("cashFlow", "cashFlow.jsonl", new TypeReference<CashFlowContainer>() {}),
    INCOME_STATEMENT("incomeStatement", "incomeStatement.jsonl", new TypeReference<IncomeStatementContainer>() {}),
    SHARE_HOLDINGS("shareHoldings", "shareHoldings.jsonl", new TypeReference<List<ShareHoldingDto>>() {}),
    KEY_RATIOS("keyRatios", "keyRatios.jsonl", new TypeReference<List<KeyRatioDto>>() {}),
    CORPORATE_ACTIONS("corporateActions", "corporateActions.jsonl", new TypeReference<List<CorporateActionDto>>() {}),
    COMPETITORS("competitors", "competitors.jsonl", new TypeReference<List<CompetitorDto>>() {});

    private final String key;
    private final String filename;
    private final TypeReference<?> typeReference;

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
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalAggregatorService {

    private final UpstoxFundamentalClient client;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;
    private final ExecutorService executor;

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
        return CompletableFuture.<SectionResponse<T>>supplyAsync(() -> {
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
        }, executor).orTimeout(5, TimeUnit.SECONDS).exceptionally(ex -> {
            log.error("Timeout or error fetching {} for ISIN: {}: {}", name, isin, ex.getMessage());
            return SectionResponseFactory.<T>error("TIMEOUT_OR_ERROR", "Failed to complete fetch for " + name, null);
        });
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
import com.vega.fundamentals.dto.KeyRatioDto;
import com.vega.fundamentals.dto.SectionResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class FundamentalAnalyzer {

    public static final String VERSION = "1.0";

    private static final Set<String> ROE_ALIASES = Set.of("roe", "roe (%)", "return on equity", "return on equity (%)");
    private static final Set<String> NPM_ALIASES = Set.of("net profit margin", "npm", "net profit margin (%)", "net margin");
    private static final Set<String> PE_ALIASES = Set.of("pe ratio", "p/e ratio", "price earnings ratio", "pe");
    private static final Set<String> PB_ALIASES = Set.of("pb ratio", "p/b ratio", "price to book", "pb");
    private static final Set<String> DE_ALIASES = Set.of("debt to equity", "debt/equity", "debt to equity ratio");

    public Map<String, Object> analyze(FundamentalSnapshot snapshot) {
        Map<String, Object> analysis = new HashMap<>();
        snapshot.setAnalysisVersion(VERSION);
        
        double profitability = calculateProfitability(snapshot);
        double valuation = calculateValuation(snapshot);
        double financialHealth = calculateFinancialHealth(snapshot);
        
        double totalScore = 0;
        double totalWeight = 0;

        if (!Double.isNaN(profitability)) {
            totalScore += profitability * 0.40;
            totalWeight += 0.40;
            analysis.put("profitability", (int) profitability);
        }
        
        if (!Double.isNaN(valuation)) {
            totalScore += valuation * 0.30;
            totalWeight += 0.30;
            analysis.put("valuation", (int) valuation);
        }
        
        if (!Double.isNaN(financialHealth)) {
            totalScore += financialHealth * 0.30;
            totalWeight += 0.30;
            analysis.put("financialHealth", (int) financialHealth);
        }

        if (totalWeight > 0) {
            int overallScore = (int) (totalScore / totalWeight);
            analysis.put("overallScore", overallScore);
        } else {
            analysis.put("overallScore", 0);
        }

        return analysis;
    }

    private double calculateProfitability(FundamentalSnapshot snapshot) {
        double score = 50;
        boolean hasData = false;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                String name = normalizeName(ratio.getName());
                if (ROE_ALIASES.contains(name)) {
                    double roe = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(roe)) {
                        score += roe > 15 ? 10 : -5;
                        hasData = true;
                    }
                }
                if (NPM_ALIASES.contains(name)) {
                    double npm = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(npm)) {
                        score += npm > 10 ? 10 : -5;
                        hasData = true;
                    }
                }
            }
        }
        return hasData ? Math.clamp(score, 0, 100) : Double.NaN;
    }

    private double calculateValuation(FundamentalSnapshot snapshot) {
        double score = 50;
        boolean hasData = false;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                String name = normalizeName(ratio.getName());
                if (PE_ALIASES.contains(name)) {
                    double pe = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(pe)) {
                        if (pe > 0 && pe < 20) score += 15;
                        else if (pe > 40) score -= 10;
                        hasData = true;
                    }
                }
                if (PB_ALIASES.contains(name)) {
                    double pb = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(pb)) {
                        if (pb > 0 && pb < 3) score += 10;
                        else if (pb > 7) score -= 10;
                        hasData = true;
                    }
                }
            }
        }
        return hasData ? Math.clamp(score, 0, 100) : Double.NaN;
    }

    private double calculateFinancialHealth(FundamentalSnapshot snapshot) {
        double score = 50;
        boolean hasData = false;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                String name = normalizeName(ratio.getName());
                if (DE_ALIASES.contains(name)) {
                    double de = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(de)) {
                        if (de < 0.5) score += 20;
                        else if (de > 1.5) score -= 15;
                        hasData = true;
                    }
                }
            }
        }
        return hasData ? Math.clamp(score, 0, 100) : Double.NaN;
    }

    private List<KeyRatioDto> getRatios(FundamentalSnapshot snapshot) {
        SectionResponse<List<KeyRatioDto>> section = snapshot.getKeyRatios();
        return (section != null && "success".equals(section.getStatus())) ? section.getData() : null;
    }

    private String normalizeName(String name) {
        if (name == null) return "";
        return name.toLowerCase().trim();
    }

    private double parseValue(String val) {
        if (val == null || val.equalsIgnoreCase("n/a") || val.equals("-") || val.trim().isEmpty()) {
            return Double.NaN;
        }
        try {
            return Double.parseDouble(val.replaceAll("[^0-9.-]", ""));
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalBootstrapService.java
package com.vega.fundamentals.service;

import com.vega.fundamentals.dto.FundamentalSnapshot;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalBootstrapService {

    private final InstrumentService instrumentService;
    private final FundamentalAggregatorService aggregatorService;
    private final ExecutorService executor;

    public BootstrapResult bootstrapFno() {
        log.info("Starting F&O bootstrap process...");
        Map<String, InstrumentService.InstrumentInfo> fnoEquities = instrumentService.getFnoEquities();
        int total = fnoEquities.size();
        log.info("Found {} F&O equities to bootstrap.", total);

        AtomicInteger successCount = new AtomicInteger(0);
        AtomicInteger failureCount = new AtomicInteger(0);
        List<String> failedIsins = new ArrayList<>();

        List<CompletableFuture<Void>> futures = fnoEquities.values().stream()
                .map(info -> CompletableFuture.runAsync(() -> {
                    try {
                        aggregatorService.aggregate(info.getIsin());
                        successCount.incrementAndGet();
                        log.info("[BOOTSTRAP] Successfully processed {} ({})", info.getIsin(), info.getSymbol());
                    } catch (Exception e) {
                        failureCount.incrementAndGet();
                        failedIsins.add(info.getIsin());
                        log.error("[BOOTSTRAP] Failed to process {} ({}): {}", info.getIsin(), info.getSymbol(), e.getMessage());
                    }
                }, executor))
                .toList();

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        log.info("Bootstrap complete. Total: {}, Success: {}, Failed: {}", total, successCount.get(), failureCount.get());

        return new BootstrapResult(total, successCount.get(), failureCount.get(), failedIsins);
    }

    public record BootstrapResult(int total, int success, int failed, List<String> failedIsins) {}
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
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FundamentalCacheService {

    private final ObjectMapper objectMapper;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;

    public FundamentalCacheService(ObjectMapper objectMapper,
                                 InstrumentService instrumentService,
                                 FundamentalAnalyzer analyzer,
                                 FundamentalHistoryService historyService) {
        this.objectMapper = objectMapper;
        this.instrumentService = instrumentService;
        this.analyzer = analyzer;
        this.historyService = historyService;
    }

    public Optional<FundamentalSnapshot> get(String isin) {
        // History is the absolute source of truth
        log.info("Retrieving fundamentals from history for ISIN: {}...", isin);
        Optional<FundamentalSnapshot> historical = historyService.reconstructSnapshot(isin);
        
        if (historical.isPresent()) {
            FundamentalSnapshot snapshot = historical.get();
            log.info("History hit for ISIN: {}", isin);
            snapshot.setAnalysis(analyzer.analyze(snapshot));
            return Optional.of(snapshot);
        }

        return Optional.empty();
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
import com.vega.fundamentals.dto.*;
import com.vega.fundamentals.model.FundamentalEndpoint;
import com.vega.fundamentals.util.SectionResponseFactory;
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
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Service
@Slf4j
public class FundamentalHistoryService {

    private static final java.util.Set<String> VOLATILE_FIELDS = java.util.Set.of(
            "fetchedTs", "generatedTs", "cacheHit", "ageMinutes",
            "requestDurationMs", "status", "message", "errorCode"
    );

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
            
            IsinMetadata metadata = loadOrRebuildMetadata(snapshot);

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
            JsonNode canonicalNode = canonicalize(normalizedNode, endpoint);
            String currentHash = generateHash(canonicalNode);

            IsinMetadata.EndpointMetadata lastEntry = metadata.getEndpoints().get(endpoint.getKey());

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

            long offset = appendHistory(Path.of(historyPath, isin), endpoint, record);

            // Update metadata
            metadata.getEndpoints().put(endpoint.getKey(), IsinMetadata.EndpointMetadata.builder()
                    .hash(currentHash)
                    .version(nextVersion)
                    .lastUpdatedTs(record.getTs())
                    .offset(offset)
                    .build());
            
            metadata.setLastUpdatedTs(record.getTs());

            log.info("Archived v{} of {} for ISIN: {} (offset: {})", nextVersion, endpoint.getKey(), isin, offset);

        } catch (Exception e) {
            log.error("Failed to archive {} for ISIN {}: {}", endpoint.getKey(), isin, e.getMessage());
        }
    }

    private IsinMetadata loadOrRebuildMetadata(FundamentalSnapshot snapshot) throws IOException {
        String isin = snapshot.getIsin();
        Path isinDir = Path.of(historyPath, isin);
        File metadataFile = isinDir.resolve("metadata.json").toFile();

        IsinMetadata metadata = null;
        if (metadataFile.exists()) {
            try {
                metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
                // Update with latest info from snapshot if provided
                metadata.setSymbol(snapshot.getSymbol());
                metadata.setCompanyName(snapshot.getCompanyName());
                metadata.setExchange(snapshot.getExchange());
            } catch (Exception e) {
                log.warn("metadata.json corrupted for ISIN: {}. Rebuilding...", isin);
            }
        }

        if (metadata == null) {
            log.info("metadata.json missing or corrupted for ISIN: {}. Rebuilding from history...", isin);
            metadata = rebuildMetadataFromHistory(isin);
            
            // Supplement with snapshot data if history was incomplete
            if (metadata.getSymbol() == null) metadata.setSymbol(snapshot.getSymbol());
            if (metadata.getCompanyName() == null) metadata.setCompanyName(snapshot.getCompanyName());
            if (metadata.getExchange() == null) metadata.setExchange(snapshot.getExchange());
        }
        return metadata;
    }

    public IsinMetadata rebuildMetadataFromHistory(String isin) {
        Instant now = Instant.now();
        IsinMetadata metadata = IsinMetadata.builder()
                .isin(isin)
                .createdTs(now) // Default to now, will be updated if history found
                .firstSeenTs(now)
                .lastUpdatedTs(now)
                .endpoints(new HashMap<>())
                .build();

        Instant absoluteFirstTs = null;
        Instant absoluteLastTs = null;

        for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
            LatestRecordInfo latestInfo = readLatestRecordDetailed(isin, endpoint);
            if (latestInfo != null) {
                HistoryRecord lastRecord = latestInfo.getRecord();
                metadata.getEndpoints().put(endpoint.getKey(), IsinMetadata.EndpointMetadata.builder()
                        .hash(lastRecord.getHash())
                        .version(lastRecord.getVersion())
                        .lastUpdatedTs(lastRecord.getTs())
                        .offset(latestInfo.getOffset())
                        .build());

                if (absoluteLastTs == null || lastRecord.getTs().isAfter(absoluteLastTs)) {
                    absoluteLastTs = lastRecord.getTs();
                }

                // Recover metadata from PROFILE if possible
                if (endpoint == FundamentalEndpoint.PROFILE) {
                    try {
                        CompanyProfileDto profile = objectMapper.convertValue(lastRecord.getData(), CompanyProfileDto.class);
                        // Some profile info might be null if not enriched, but Aggregator usually enriches.
                        // However, history stores raw or enriched data depending on when it was archived.
                    } catch (Exception e) {
                        log.warn("Failed to extract profile info during metadata rebuild for ISIN: {}", isin);
                    }
                }

                // Find the first record for this endpoint to get firstSeenTs
                HistoryRecord firstRecord = readFirstRecord(isin, endpoint);
                if (firstRecord != null) {
                    if (absoluteFirstTs == null || firstRecord.getTs().isBefore(absoluteFirstTs)) {
                        absoluteFirstTs = firstRecord.getTs();
                    }
                }
            }
        }

        if (absoluteFirstTs != null) {
            metadata.setFirstSeenTs(absoluteFirstTs);
            metadata.setCreatedTs(absoluteFirstTs); // createdTs usually aligns with first seen
        }
        if (absoluteLastTs != null) {
            metadata.setLastUpdatedTs(absoluteLastTs);
        }

        // Try to recover Symbol/Name from reconstruction if possible (PROFILE section)
        reconstructSnapshot(isin).ifPresent(snapshot -> {
            metadata.setSymbol(snapshot.getSymbol());
            metadata.setCompanyName(snapshot.getCompanyName());
            metadata.setExchange(snapshot.getExchange());
        });

        if (!metadata.getEndpoints().isEmpty()) {
            log.info("Successfully rebuilt metadata from history for ISIN: {} with {} endpoints.", isin, metadata.getEndpoints().size());
        }
        return metadata;
    }

    private void rebuildEndpointMetadata(String isin, IsinMetadata metadata) {
        // Legacy method now delegates to the more comprehensive rebuild
        IsinMetadata rebuilt = rebuildMetadataFromHistory(isin);
        metadata.setEndpoints(rebuilt.getEndpoints());
        metadata.setFirstSeenTs(rebuilt.getFirstSeenTs());
        metadata.setCreatedTs(rebuilt.getCreatedTs());
        metadata.setLastUpdatedTs(rebuilt.getLastUpdatedTs());
        if (metadata.getSymbol() == null) metadata.setSymbol(rebuilt.getSymbol());
        if (metadata.getCompanyName() == null) metadata.setCompanyName(rebuilt.getCompanyName());
        if (metadata.getExchange() == null) metadata.setExchange(rebuilt.getExchange());
    }

    private HistoryRecord readFirstRecord(String isin, FundamentalEndpoint endpoint) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            String line = raf.readLine();
            if (line != null && !line.trim().isEmpty()) {
                return objectMapper.readValue(line, HistoryRecord.class);
            }
        } catch (IOException e) {
            log.error("Failed to read first record for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private void saveIsinMetadata(String isin, IsinMetadata metadata) throws IOException {
        File metadataFile = Path.of(historyPath, isin, "metadata.json").toFile();
        objectMapper.writeValue(metadataFile, metadata);
        // Clean up legacy index if it exists
        Files.deleteIfExists(Path.of(historyPath, isin, "latest-index.json"));
    }

    private JsonNode normalize(JsonNode node) {
        if (node == null) return null;
        if (node.isArray()) {
            com.fasterxml.jackson.databind.node.ArrayNode normalizedArray = objectMapper.createArrayNode();
            for (JsonNode item : node) {
                normalizedArray.add(normalize(item));
            }
            return normalizedArray;
        }
        if (!node.isObject()) return node;
        
        ObjectNode normalized = node.deepCopy();
        VOLATILE_FIELDS.forEach(normalized::remove);
        
        java.util.Iterator<Map.Entry<String, JsonNode>> fields = normalized.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            normalized.set(field.getKey(), normalize(field.getValue()));
        }
        
        return normalized;
    }

    private JsonNode canonicalize(JsonNode node, FundamentalEndpoint endpoint) {
        if (node == null || !node.isArray()) return node;

        com.fasterxml.jackson.databind.node.ArrayNode array = (com.fasterxml.jackson.databind.node.ArrayNode) node;
        java.util.List<JsonNode> elements = new java.util.ArrayList<>();
        array.forEach(elements::add);

        switch (endpoint) {
            case COMPETITORS -> elements.sort(java.util.Comparator.comparing((JsonNode n) -> n.path("instrument_key").asText(""))
                    .thenComparing(n -> n.path("isin").asText(""))
                    .thenComparing(n -> n.path("company_name").asText("")));
            case SHARE_HOLDINGS -> elements.sort(java.util.Comparator.comparing(n -> n.path("category").asText("")));
            case KEY_RATIOS -> elements.sort(java.util.Comparator.comparing(n -> n.path("name").asText("")));
            case CORPORATE_ACTIONS -> elements.sort(java.util.Comparator.comparing((JsonNode n) -> n.path("name").asText(""))
                    .thenComparing(n -> n.path("expiry_date").asText("")));
        }

        com.fasterxml.jackson.databind.node.ArrayNode sortedArray = objectMapper.createArrayNode();
        elements.forEach(sortedArray::add);
        return sortedArray;
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

    private long appendHistory(Path dir, FundamentalEndpoint endpoint, HistoryRecord record) throws IOException {
        File historyFile = dir.resolve(endpoint.getFilename()).toFile();
        long offset = historyFile.exists() ? historyFile.length() : 0;
        
        String line = objectMapper.writeValueAsString(record);
        try (FileWriter fw = new FileWriter(historyFile, true)) {
            fw.write(line + "\n");
        }
        return offset;
    }

    public Optional<FundamentalSnapshot> reconstructSnapshot(String isin) {
        return reconstructSnapshot(isin, null);
    }

    public Optional<FundamentalSnapshot> reconstructSnapshot(String isin, Instant asOf) {
        Path isinDir = Path.of(historyPath, isin);
        if (!Files.exists(isinDir)) return Optional.empty();

        File metadataFile = isinDir.resolve("metadata.json").toFile();
        if (!metadataFile.exists() && asOf == null) return Optional.empty();

        try {
            IsinMetadata metadata = metadataFile.exists() ? objectMapper.readValue(metadataFile, IsinMetadata.class) : null;

            FundamentalSnapshot.FundamentalSnapshotBuilder builder = FundamentalSnapshot.builder()
                    .schemaVersion("2.0")
                    .status("success")
                    .source("HISTORY")
                    .isin(isin)
                    .cacheHit(true);

            if (metadata != null) {
                builder.symbol(metadata.getSymbol())
                        .companyName(metadata.getCompanyName())
                        .exchange(metadata.getExchange())
                        .generatedTs(metadata.getLastUpdatedTs());
            }

            for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
                setReconstructedSection(builder, isin, endpoint, metadata, asOf);
            }

            FundamentalSnapshot snapshot = builder.build();
            return Optional.of(snapshot);

        } catch (IOException e) {
            log.error("Failed to reconstruct snapshot for ISIN {}: {}", isin, e.getMessage());
            return Optional.empty();
        }
    }

    @SuppressWarnings("unchecked")
    private void setReconstructedSection(FundamentalSnapshot.FundamentalSnapshotBuilder builder, String isin, FundamentalEndpoint endpoint, IsinMetadata metadata, Instant asOf) {
        SectionResponse<?> section = reconstructSection(isin, endpoint, metadata, asOf);
        switch (endpoint) {
            case PROFILE -> builder.profile((SectionResponse<CompanyProfileDto>) section);
            case BALANCE_SHEET -> builder.balanceSheet((SectionResponse<BalanceSheetContainer>) section);
            case CASH_FLOW -> builder.cashFlow((SectionResponse<CashFlowContainer>) section);
            case INCOME_STATEMENT -> builder.incomeStatement((SectionResponse<IncomeStatementContainer>) section);
            case SHARE_HOLDINGS -> builder.shareHoldings((SectionResponse<List<ShareHoldingDto>>) section);
            case KEY_RATIOS -> builder.keyRatios((SectionResponse<List<KeyRatioDto>>) section);
            case CORPORATE_ACTIONS -> builder.corporateActions((SectionResponse<List<CorporateActionDto>>) section);
            case COMPETITORS -> builder.competitors((SectionResponse<List<CompetitorDto>>) section);
        }
    }

    @SuppressWarnings("unchecked")
    private <T> SectionResponse<T> reconstructSection(String isin, FundamentalEndpoint endpoint, IsinMetadata metadata, Instant asOf) {
        HistoryRecord record = null;

        if (asOf == null && metadata != null) {
            IsinMetadata.EndpointMetadata endpointMeta = metadata.getEndpoints().get(endpoint.getKey());
            if (endpointMeta != null && endpointMeta.getOffset() >= 0) {
                record = readRecordAtOffset(isin, endpoint, endpointMeta.getOffset());
                // Integrity check: verify hash matches metadata
                if (record != null && !record.getHash().equals(endpointMeta.getHash())) {
                    log.warn("Hash mismatch for {} (ISIN: {}) at offset {}. Expected: {}, Actual: {}. Falling back to latest scan.",
                            endpoint.getKey(), isin, endpointMeta.getOffset(), endpointMeta.getHash(), record.getHash());
                    record = null;
                }
            }
        }

        if (record == null) {
            record = (asOf == null) ? readLatestRecord(isin, endpoint) : readRecordAtTimestamp(isin, endpoint, asOf);
        }

        if (record == null) {
            return (SectionResponse<T>) SectionResponse.builder()
                    .status("error")
                    .errorCode("HISTORY_MISSING")
                    .message("No historical data found for " + endpoint.getKey())
                    .build();
        }

        try {
            T data = (T) objectMapper.convertValue(record.getData(), endpoint.getTypeReference());
            return SectionResponseFactory.cached(data, record.getTs());
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
        LatestRecordInfo info = readLatestRecordDetailed(isin, endpoint);
        return info != null ? info.getRecord() : null;
    }

    private HistoryRecord readRecordAtOffset(String isin, FundamentalEndpoint endpoint, long offset) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            if (offset >= raf.length()) return null;
            raf.seek(offset);
            String line = raf.readLine();
            if (line != null) {
                return objectMapper.readValue(line, HistoryRecord.class);
            }
        } catch (IOException e) {
            log.error("Failed to read record at offset {} for {} (ISIN: {}): {}", offset, endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private HistoryRecord readRecordAtTimestamp(String isin, FundamentalEndpoint endpoint, Instant timestamp) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            long length = raf.length();
            if (length <= 0) return null;

            // Simple reverse scan for small files. For large files, we'd want an index.
            long pos = length - 1;
            while (pos >= 0) {
                raf.seek(pos);
                if (pos == 0 || raf.readByte() == '\n') {
                    long offset = (pos == 0) ? 0 : pos + 1;
                    raf.seek(offset);
                    String line = raf.readLine();
                    if (line != null && !line.trim().isEmpty()) {
                        HistoryRecord record = objectMapper.readValue(line, HistoryRecord.class);
                        if (!record.getTs().isAfter(timestamp)) {
                            return record;
                        }
                    }
                    if (pos == 0) break;
                    pos = offset - 2; // Move before the newline we just found
                } else {
                    pos--;
                }
            }
        } catch (IOException e) {
            log.error("Failed to read record at timestamp for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private LatestRecordInfo readLatestRecordDetailed(String isin, FundamentalEndpoint endpoint) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try {
            return readLastLineDetailed(historyFile.toFile());
        } catch (IOException e) {
            log.error("Failed to read latest record for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private LatestRecordInfo readLastLineDetailed(File file) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long length = raf.length();
            if (length <= 0) return null;

            long pos = length - 1;
            raf.seek(pos);
            while (pos > 0 && raf.readByte() == '\n') {
                pos--;
                raf.seek(pos);
            }

            while (pos >= 0) {
                raf.seek(pos);
                if (pos == 0 || raf.readByte() == '\n') {
                    long offset = (pos == 0) ? 0 : pos + 1;
                    raf.seek(offset);

                    byte[] bytes = new byte[(int) (length - offset)];
                    raf.readFully(bytes);
                    String line = new String(bytes, StandardCharsets.UTF_8).trim();
                    if (line.isEmpty()) return null;

                    HistoryRecord record = objectMapper.readValue(line, HistoryRecord.class);
                    return new LatestRecordInfo(record, offset);
                }
                pos--;
            }
        }
        return null;
    }

    @lombok.Data
    @lombok.AllArgsConstructor
    private static class LatestRecordInfo {
        private HistoryRecord record;
        private long offset;
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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class InstrumentService {

    private final String instrumentPath;
    private final ObjectMapper objectMapper;
    private final Map<String, InstrumentInfo> isinMap = new HashMap<>();
    private final Map<String, InstrumentInfo> instrumentKeyMap = new HashMap<>();
    private final Map<String, InstrumentInfo> fnoEquities = new HashMap<>();

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
                Set<String> fnoUnderlyingKeys = new HashSet<>();
                for (JsonNode node : root) {
                    String isin = node.path("isin").asText(null);
                    String instrumentKey = node.path("instrument_key").asText(null);
                    String segment = node.path("segment").asText("");
                    String underlyingType = node.path("underlying_type").asText("");
                    String underlyingKey = node.path("underlying_key").asText("");

                    if ("NSE_FO".equals(segment) && "EQUITY".equals(underlyingType) && !underlyingKey.isEmpty()) {
                        fnoUnderlyingKeys.add(underlyingKey);
                    }

                    InstrumentInfo info = new InstrumentInfo();
                    info.setIsin(isin);
                    info.setSymbol(node.path("trading_symbol").asText(node.path("asset_symbol").asText()));
                    info.setName(node.path("name").asText(null));
                    info.setExchange(node.path("exchange").asText());
                    info.setInstrumentKey(instrumentKey);
                    info.setSegment(segment);

                    if (isin != null && !isin.isEmpty()) {
                        isinMap.put(isin, info);
                    }
                    if (instrumentKey != null && !instrumentKey.isEmpty()) {
                        instrumentKeyMap.put(instrumentKey, info);
                    }
                }

                // Identify F&O linked equities
                for (String key : fnoUnderlyingKeys) {
                    InstrumentInfo eqInfo = instrumentKeyMap.get(key);
                    if (eqInfo != null && "NSE_EQ".equals(eqInfo.getSegment()) && eqInfo.getIsin() != null) {
                        fnoEquities.put(eqInfo.getIsin(), eqInfo);
                    }
                }
            }
            log.info("Loaded {} instruments (ISINs: {}, Keys: {}) from {}", 
                    isinMap.size(), isinMap.size(), instrumentKeyMap.size(), instrumentPath);
            log.info("Identified {} F&O linked equities.", fnoEquities.size());
        } catch (IOException e) {
            log.error("Failed to load instruments: {}", e.getMessage());
        }
    }

    public Map<String, InstrumentInfo> getFnoEquities() {
        return Collections.unmodifiableMap(fnoEquities);
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
        private String segment;
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

```json
// File: history/fundamentals/INE692A01016/metadata.json
{"schemaVersion":"1.0","isin":"INE692A01016","symbol":"UNIONBANK","companyName":"UNION BANK OF INDIA","exchange":"NSE","createdTs":"2026-06-14T06:58:27.342710160Z","firstSeenTs":"2026-06-14T06:58:27.342710160Z","lastUpdatedTs":"2026-06-14T06:58:27.342710160Z","endpoints":{}}
```
