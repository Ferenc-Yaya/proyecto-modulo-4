- Java 17+
- Docker (para ejecutar MySQL y Redis) en la carpeta docker
- Base de datos MySQL con el esquema "world"


may. 13, 2025 11:22:51 P. M. org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@33f2df51] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.

Connected to Redis

Redis:	50 ms
MySQL:	72 ms
may. 13, 2025 11:22:55 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:p6spy:mysql://localhost:3307/world]

Process finished with exit code 0