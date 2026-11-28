
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7394224a1c7d4ef31dd592ee0c20a20f",
        "aarch64-unknown-linux-musl": "bd8653a5109c714211624dbf41b88186",
        "arm-unknown-linux-gnueabi": "fa54fdcf6e5a1933c835cfa00351ad2a",
        "arm-unknown-linux-gnueabihf": "d3b06de42b7b1df78583acabbb9c4b39",
        "armv5te-unknown-linux-gnueabi": "5ae455c352944e4f57f80d02bb16c6cd",
        "armv5te-unknown-linux-musleabi": "484591348e5604475b8a5bb362b145d8",
        "armv7-unknown-linux-gnueabihf": "2a12a19ef8b5671b17313f23be62a052",
        "armv7-unknown-linux-musleabihf": "05b0a8ef1ec48b2f44901d0209aef7c1",
        "i686-unknown-linux-gnu": "00b29c72d28716fd5fb304cf92ab2b95",
        "powerpc-unknown-linux-gnu": "8c08184877869a2aeffee840979074cb",
        "x86_64-unknown-linux-gnu": "8da7d8b32c9a37b4f479d2f1c6cc5c27",
        "riscv64gc-unknown-linux-gnu": "0ccf657f441fa8b19626e9a5c4e443e8",
        "thumbv7neon-unknown-linux-gnueabihf": "a4edad8643e98264a95244f9734ef4a0",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "49d26d5591cb129588397dfb4fd3156206a9f5ab8323bb189533536f0fc88ba0",
        "aarch64-unknown-linux-musl": "0ad9f0797298bf3d6fbaab5b09fcfd84416dc183465291b87ebfc9a9a69cfb09",
        "arm-unknown-linux-gnueabi": "9974a365c0e5fa8a22a8c148c11ae49e5b546098cb6cff575c88c20940ed851e",
        "arm-unknown-linux-gnueabihf": "ceb0c92a5dbce48f66fdd5c73d8435d76eb29c64bea4281bbae0554c390696b3",
        "armv5te-unknown-linux-gnueabi": "8d62d352a7f5698543c9acb43b66fb2b02c5341bd87e8b012df4d45d41fddad4",
        "armv5te-unknown-linux-musleabi": "58799a74d3ba7abb95edeb459b8bb9528bf8c98a0a99b9f8c8ab3e3310c14b58",
        "armv7-unknown-linux-gnueabihf": "9e6201e3c7b61c96f394eedcc062665692898a41d818d25a7a60c186e40bd674",
        "armv7-unknown-linux-musleabihf": "6f69a5f8978233a36b8b18d70263f4dc78f681f95a1518315f2695a9abb48a86",
        "i686-unknown-linux-gnu": "16c5a558a790bfe6b2f35f8fc395b3cb482bb80292906d04f1b93ba3ab4b5011",
        "powerpc-unknown-linux-gnu": "c13144b17183338410949167eda4c2617ffdac30189b82304151ce2ea7d3b062",
        "x86_64-unknown-linux-gnu": "ceaa1fd4662ec04a1d3008f3d4bfe9f781773ae6e25eedb3419b348a72a9db40",
        "riscv64gc-unknown-linux-gnu": "1c58bdd09784ab02cfcea9896cb360ee0f13079df9589fc611e0751a648bfdaa",
        "thumbv7neon-unknown-linux-gnueabihf": "dc62ed2cacda9ee2af9317fe409e3bbfb028a3d5b278bf80a003d5a87e86c9a7",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b181fe8b82d6f296c2647382aa5c8906",
        "arm-unknown-linux-gnueabi": "60946ffb4c08f0d5627848f293ae825c",
        "arm-unknown-linux-gnueabihf": "4346be3c4baec088d1f0e53450f834e4",
        "armv7-unknown-linux-gnueabihf": "e06dcf5608818a93ca54a1e68c7a6c4a",
        "i686-unknown-linux-gnu": "5da73c0c3588ca51341acbf6ef42abe0",
        "x86_64-unknown-linux-gnu": "bd5a86f6a325cf929e42a07f1711a635",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c7d99abaedc213b0d0f2671d1fab706547e54f88f1682d62d777f2cca80fd751",
        "arm-unknown-linux-gnueabi": "104e9609f84f19233463c0ef0291add4fee5840d1a11f3ef38d45ae0cd2044fd",
        "arm-unknown-linux-gnueabihf": "5ee18bd821e9e2af892f0292cc9ca97c54db61bf3086b7042663260eed279e62",
        "armv7-unknown-linux-gnueabihf": "7f302b84be9700f9e571f0b945c0542732494d4916f963e30c994e4f58d6ec5d",
        "i686-unknown-linux-gnu": "859a7e6d734bd440fdd810c7ac17083910f7bdbffe5970135d2d34fb1312cc8a",
        "x86_64-unknown-linux-gnu": "11c38d8d8e935a7ad871227d51053eb7f8d0a9e3c998b6f500d7ad35eb4120d9",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
