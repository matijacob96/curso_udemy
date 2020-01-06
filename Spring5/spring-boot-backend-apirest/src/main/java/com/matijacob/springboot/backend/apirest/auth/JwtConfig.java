package com.matijacob.springboot.backend.apirest.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

    public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpAIBAAKCAQEAtaCQaHIjgVysL4h6cmL1XdkvmOO/VJ71wSe4xPv24gcJC0uJ\n" +
            "QDe6dLBDtCMSg8zhwdTVkpJkoiSJa6J4WNreaO2Y8TG6pC+WFQByUZRrCYu8WKkI\n" +
            "jjdLKMX0jqqqaHZvRu4FEipn99m9uCcw9cFElWTiatE86St80m4Dt8guuaTiOO4B\n" +
            "HJDcKobIJercJFjENL2blSZoQHnVWxowsdTBMcXYBsj0o5Mv4GoXGKQmm17XUQAz\n" +
            "Bvl8nTE2QmwBdftHSQJMBFeTmNqKTTtN+yuA5ERV+Nw2KAHuUZvehBk7xbRNYz0R\n" +
            "Kn7m5gpcbQbyQZ5QmN5FcgmdVw8u3BYU7+8w6wIDAQABAoIBAQCuLu0u7X91eW28\n" +
            "LDPZ7WOI/Fe0VX5RZh0jf7eoWkfbXoni5i8bghZz//L+F8CS2/MKE9Y6ueB+y3Fq\n" +
            "4yZteIFhubM6ZMms2eIiBAqeiCravcMEeB83XHndAXNXOv8wLZzsNipw0HBi9tQG\n" +
            "frdqiE4Aw/6MGFxE9arAmDdCkl2VNJjA3vfdn9OCzcLQ634LlnOZBm/3hkXJ2CNG\n" +
            "O9yxZKjHiUsi1jAc2RSa67/tkwpmNK6kUZa1OJ9aIicqYycSU9DYcGHjrRqgEyiE\n" +
            "apHPIfwmqIfgcipsYACcyeDG6mFL5SgDy+sdA+ZdmNt1HkCADbZ6K/bmsOHz0VQq\n" +
            "HQEBOEiBAoGBAOBYHFAEqSkTbXyohzqUgxhAXBRQh2t2pX69G94GMeIIkiiL4Ii+\n" +
            "WeVvcVYxffCSMLs26PolEy6yuCCaiIfzx7Ht+tDT/ga2Uc3ZWQj07HuRG+AshE3Y\n" +
            "NhQEwsj7npH1hAk54FXclv+V/i67WdInlGPHHAFO2P8TEOMahkwc35vBAoGBAM9B\n" +
            "aADeALZLEAi9oAxD46M/l1FwEnm/USebks4QkzGNI8oV0dtHaOZS6Rv4/VuUt4eN\n" +
            "C6uzVZV5O+WaWzoLFE8rp13H2Yfg2DulWPjH4RsIL3GBVzcvgcRHFBS+aB0Lftde\n" +
            "W6HdJTob8XiFgzbo8+IbhoJQq9stJFfSrilOx+erAoGAabC47e20L/jKHO9cffmX\n" +
            "ZSZ0+tERa0xDHVlENq4edAlrqhRz3Jgoy9FbyKqaVWrZ8GknCynKRrbFzf5fkgUE\n" +
            "MEwYXKdyxoDAO0VJD9IrUu+C/XKbhfz1RSsVBRCdnM/Yu2v7xxecP57PV/7Fix9A\n" +
            "Zl1YUTlvO4Qk8Yj+ef8kTUECgYBJ/OuIA7j1Wu6qcCeGuWW2jakTZZLy652pKhzK\n" +
            "e5hQhDZWmluEkIWeU9LsLYMlAn5SYcPc0/Slm9YKLYSLwBDMAqWJESNTIq2O/YQ5\n" +
            "rAFsiQuG1cmw5cDJtSYyEZdRZx0s/X5w1mXHzNnzUJZ7L8aA3ZqzQuFXKVJkF84c\n" +
            "6QbsaQKBgQC7jfusnYTPQUbz5IAorqwJWjsrIBlHysEAAxFeHSKLCmn/SMrgFDHa\n" +
            "4WR2unOyF0/FShLHeWcMJJQ7mdyCyJG4jyUSdBvtsbXZPRyHwH9o6acmqmKvkejK\n" +
            "K/59mEVCjglbVQyBTFTmcgt8KfNOFeBJKvZX7wB9vp8u4TcLwpwx3g==\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtaCQaHIjgVysL4h6cmL1\n" +
            "XdkvmOO/VJ71wSe4xPv24gcJC0uJQDe6dLBDtCMSg8zhwdTVkpJkoiSJa6J4WNre\n" +
            "aO2Y8TG6pC+WFQByUZRrCYu8WKkIjjdLKMX0jqqqaHZvRu4FEipn99m9uCcw9cFE\n" +
            "lWTiatE86St80m4Dt8guuaTiOO4BHJDcKobIJercJFjENL2blSZoQHnVWxowsdTB\n" +
            "McXYBsj0o5Mv4GoXGKQmm17XUQAzBvl8nTE2QmwBdftHSQJMBFeTmNqKTTtN+yuA\n" +
            "5ERV+Nw2KAHuUZvehBk7xbRNYz0RKn7m5gpcbQbyQZ5QmN5FcgmdVw8u3BYU7+8w\n" +
            "6wIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
