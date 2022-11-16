provider "aws"{
    region="${var.region}"
}

resource "aws_s3_bucket" "digitalhouse" {
    bucket = "${var.bucket_name}"
    acl = "${var.acl_value}"
}