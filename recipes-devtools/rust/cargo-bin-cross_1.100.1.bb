
# Recipe for cargo 20261127
# This corresponds to rust release 1.100.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "abd5d5979c87819360c5da36834c259e",
        "arm-unknown-linux-gnueabi": "9d1c047797ae5724f1a690dfe36114e9",
        "arm-unknown-linux-gnueabihf": "0cce0c48458092b70b5566a5eb467d88",
        "armv7-unknown-linux-gnueabihf": "c68cbcc37b7d7c0e28dac88b61dadf9d",
        "i686-unknown-linux-gnu": "b53a7270d490b31279f177475df28d8c",
        "x86_64-unknown-linux-gnu": "4438c6409d33da64da3af602e580733a",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f5093f119f1390caea4acbc7d97476e53b88f959964ebfe57718773c7ed693b7",
        "arm-unknown-linux-gnueabi": "98b6ad488db5215b8a1f9173d5fa9a8ae880bec5e1dd5a1ee7b66523a3e82313",
        "arm-unknown-linux-gnueabihf": "5f15a37e719003a6cb8da1a07d6c388095b5f9b446e45e5d45dd418f47d52ba1",
        "armv7-unknown-linux-gnueabihf": "a2cdb75b86bb6b4c676a940671062cd6ef51164d9995521a2251c7dbf2e77483",
        "i686-unknown-linux-gnu": "b097062892867c35c9042c46498afc84ce1758bbb152298d0293196fb403aa5e",
        "x86_64-unknown-linux-gnu": "965d154ea193f8f446482b627bf636690923ea05acebc95a54ffc9545065ed96",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-11-27/cargo-1.100.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-11-27/cargo-1.100.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-11-27/cargo-1.100.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-11-27/cargo-1.100.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-11-27/cargo-1.100.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-11-27/cargo-1.100.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.100.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
