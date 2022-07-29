const MetaSdk = require('./NativeMetaSdk').default

export function multiply(a: number, b: number): number {
  return MetaSdk.multiply(a, b);
}
