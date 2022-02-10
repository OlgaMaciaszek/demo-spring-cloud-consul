Before running this app run consul:

```shell
 consul agent -data-dir=tmp/consul -dev
```

and add a test value to Consul key-value store:

```shell
curl --request PUT --data test7 http://localhost:8500/v1/kv/config/demo-spring-cloud-consul/demox
```